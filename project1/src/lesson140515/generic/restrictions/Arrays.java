package lesson140515.generic.restrictions;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
	
	public static void main(String[] args) {
		List<Integer>[] arrayOfLists = new List<Integer>[10];
		List<?>[] arrayOfLists2 = new List<?>[10];
		
		List<String>[] aos = (List<String>[]) new List[10];
	}
	
}
