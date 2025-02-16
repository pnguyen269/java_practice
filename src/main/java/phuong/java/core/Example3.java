package phuong.java.core;

public class Example3 {
	public int CalculTotal(int number){
		int sum = 0;
		for(int i =0; i<=number;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}

		return sum;
	}
}
