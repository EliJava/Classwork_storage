package lesson140527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 40, 50, 60);
		
		System.out.println(list);
		
	}
	
}
