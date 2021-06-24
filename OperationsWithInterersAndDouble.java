package shreyash.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithInterersAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		System.out.println(i / 6);
		System.out.println(i - (6 * 3));
		System.out.println((double)i/3);
		
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);
		
		double d = 3.1;
		double d2 = 1.29;
		
		System.out.println(d - d2);
		
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(1.29).setScale(2);
		System.out.println(bd3.subtract(bd4));
		

	}

}
