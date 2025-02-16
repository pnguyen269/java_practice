package phuong.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
	public void findBiggestValue(){
		List<Integer> list = Arrays.asList(-3,-2,-1);
		if(list!=null) {
			Integer maxValue = list.get(0), biggestIndex =0;
			for(int i = 0; i<list.size();i++) {
				if(list.get(i)> maxValue) {
					maxValue=list.get(i);
					biggestIndex = i;
				}
			}
			System.out.println("The biggest number of array is" + maxValue);
			System.out.println("The index of biggest number is" + biggestIndex);
		}
	}
}
