package lesson140515.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardHelper {

	static void foo(List<?> list){
//		list.set(0, list.get(0));
		
		helper(list);
	}

	static private <T> void helper(List<T> list) {
		list.set(0, list.get(0));
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		
		foo(list);
		
	}
}
