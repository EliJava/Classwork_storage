package lesson140513.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Wildcard {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("zero");
		list.add("one");
		list.add("two");
		
		print(list);
		
		List<Integer> list2 = new LinkedList<>();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		print(list2);
	}

	private static void print(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}
	
}
