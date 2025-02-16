package phuong.java.core;

import java.util.HashSet;

public class Example5 {
	public void sizeOfSet() {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		System.out.println(numbers.size());
	}
}
