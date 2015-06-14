package billpay.burndown.exception;

import java.io.IOException;

public class BurndownGenException extends Exception{

	private static final long serialVersionUID = -725055300519617069L;

	public BurndownGenException(IOException e1) {
		super(e1);
	}

}
