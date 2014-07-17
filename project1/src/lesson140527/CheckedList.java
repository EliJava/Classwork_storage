package lesson140527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		process(Collections.checkedList(list, Integer.class));
		
		Collections.sort(list);
		
		System.out.println(list);
	}

	private static void process(List<Integer> list) {
		
		List list2 = list;
		list2.add("Hello");
		
	}
	
	
}
