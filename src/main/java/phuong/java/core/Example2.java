package phuong.java.core;

import java.math.BigDecimal;
import java.util.Scanner;

public class Example2 {
	public static BigDecimal readValue() {
		BigDecimal numb1 = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the value of number1");
			numb1 = scanner.nextBigDecimal();
		}
		System.out.println("You entered value of number1 is " +numb1);
		/*System.out.println("Enter the value of number2");
		BigDecimal numb2 = scanner.nextBigDecimal();
		System.out.println("You entered value of number2 is " +numb2);*/
		return numb1;
		
	}
	public static void main(String[] args) {
		BigDecimal number1 = readValue();
		BigDecimal number2 = new BigDecimal(100);
		if((number1 == null) || (number2 == null)) {
			System.out.println("cannot compare with NULL value");
		}else
		if(number1.equals(number2)) {
			System.out.println("Equal");
		}else
		if(number1.compareTo(number2) > 0) {
			System.out.println("number1 > number 2");
		}else
		if(number1.compareTo(number2) < 0) {
			System.out.println("number1 < number 2");
		}
	}
}
