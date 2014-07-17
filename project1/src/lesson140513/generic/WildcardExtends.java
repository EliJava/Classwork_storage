package lesson140513.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardExtends {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		List<Double> ld = new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		double sum = sum(li);
		
		ld.add(3.5);
		ld.add(8.6);
		ld.add(4.7);
		
		sum += sum(ld);
		
		System.out.println(sum);
	}

	private static double sum(List<? extends Number> li) {
		double sum = 0;
		
		for (Number num : li) {
			sum += num.doubleValue();
		}
		
		return sum;
	}
	
}
