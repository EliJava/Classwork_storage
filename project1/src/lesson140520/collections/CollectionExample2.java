package lesson140520.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionExample2 {

	public static void main(String[] args) {
		Collection<Integer> bag = new ArrayList<Integer>();
		
		bag.add(10);
		bag.add(20);
		bag.add(30);
		
		bag.addAll(Arrays.asList(40, 50, 60, 70));
		
		System.out.println(bag);
		
		Collection<Integer> bag2 = Arrays.asList(60, 70, 80, 90, 100);
		bag.retainAll(bag2);
		System.out.println(bag);
	}
	
}
