package lesson140515.generic;

import java.util.ArrayList;
import java.util.List;

public class ErasureAndMethods {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		List<Float> lf = new ArrayList<>();
		
		sum(li);
		
		sum(lf);
	}

	private static void sum(List<Float> lf) {
		
	}

	private static void sum(List<Integer> li) {

		
	}
	
}
