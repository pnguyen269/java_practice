package phuong.java.core;

public class Main {
 public static void main(String[] args) {
	Example3 runEx3 = new Example3();
	int number = 10, total = 0;
	total=runEx3.CalculTotal(number);
	System.out.println("total odd of "+number+" is " +total);
	
	Example4 runEx4 = new Example4();
	runEx4.findBiggestValue();
	
	Example5 runEx5 = new Example5();
	runEx5.sizeOfSet();
}
}
