SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `burndown` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `burndown` ;

-- -----------------------------------------------------
-- Table `burndown`.`burndown`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `burndown`.`burndown` (
  `sprint` VARCHAR(50) NOT NULL ,
  `active` TINYINT(1)  NULL ,
  `current_sprint_day` VARCHAR(45) NULL ,
  `update_date` DATETIME NULL ,
  PRIMARY KEY (`sprint`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `burndown`.`daily_work`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `burndown`.`daily_work` (
  `id` INT NOT NULL ,
  `remaining` INT NOT NULL ,
  `estimated` INT NULL ,
  `workdone` INT NULL ,
  `found` INT NULL ,
  `day` INT NOT NULL ,
  `create_date` DATETIME NULL ,
  `burndown` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `burndown` (`burndown` ASC) ,
  CONSTRAINT `burndown`
    FOREIGN KEY (`burndown` )
    REFERENCES `burndown`.`burndown` (`sprint` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
