package billpay.burndown.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BurndownUtils {
	private static BigDecimal secondDiv = new BigDecimal(60);
	public static BigDecimal convertToHours(BigDecimal seconds){
		return (seconds.divide(secondDiv, 2, RoundingMode.HALF_UP)).divide(secondDiv, 2, RoundingMode.HALF_UP);
	}
}
