INSERT INTO Customer (id, firstname, lastname) VALUES (1, 'Dave', 'Matthews');
INSERT INTO Customer (id, firstname, lastname) VALUES (2, 'Carter', 'Beauford');
INSERT INTO Customer (id, firstname, lastname) VALUES (3, 'Stephan', 'Lassard');

INSERT INTO Account (id, customer_id, expiryDate) VALUES (1, 1, '2010-12-31');
INSERT INTO Account (id, customer_id, expiryDate) VALUES (2, 1, '2011-03-31');

INSERT INTO Customer (id, firstname, lastname) VALUES (4, 'Charly', 'Matthews');
INSERT INTO Customer (id, firstname, lastname) VALUES (5, 'Chris', 'Matthews');
INSERT INTO Customer (id, firstname, lastname) VALUES (6, 'Paula', 'Matthews');

CREATE OR REPLACE FUNCTION ipaylater_debt.update_debt_transaction_tc_aut_deu()
  RETURNS ipl_api.ipl_modification_result AS
$BODY$
DECLARE
    purposeVar           text;
    subdebtIdVar           text;
    subdebtNumberIdVar	bigint;

BEGIN
    RAISE INFO 'CHECK DEBT STATUS';

	CREATE TEMPORARY TABLE tmp_operation ON COMMIT DROP AS
		SELECT dsd_id as subdebtId, dth_id as historyId

    	from ipaylater_debt.debt_sub_debts
    	join ipaylater_debt.debt on (d_order_id = dsd_order_id)

    	purposeVar := COALESCE((SELECT (regexp_matches(dth_purpose, 'BP/[0-9]*'))[1]));
    	subdebtIdVar := substr(purpose,position('/' in purpose) + 1);
    	subdebtNumberIdVar := CASE WHEN
    	length(subdebtIdVar)=0
    	THEN 0
    	ELSE
    	subdebtIdVar::bigint
    	END;
    	
    	join ipaylater_debt.debt_transaction_history on (dsd_id = subdebtNumberIdVar)
   
    --For TC AUT/DEU
    where d_payment_method = 3 AND
    d_country in ('DEU','AUT')
    group by subdebtId,historyId;

	ALTER TABLE tmp_operation ADD UNIQUE(subdebtId,historyId);
	
	UPDATE ipaylater_debt.debt_transaction
	SET dt_subdebt_id = subdebtId
	from tmp_operation
	WHERE dt_history_entry = historyId
	 AND dt_transaction_type in (2,10);
	
	DROP TABLE tmp_operation;
    
    return_value.result_status_msg:='An error accured';
    RETURN return_value;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE SECURITY DEFINER
  COST 100;
ALTER FUNCTION ipaylater_debt.update_debt_transaction_tc_aut_deu() OWNER TO postgres;