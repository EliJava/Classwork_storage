package lesson140708;

import java.util.HashMap;
import java.util.Map;

public class StringNumbers {

	static final Map<Integer, String> words = new HashMap<Integer, String>();

	static{
		words.put(1, "один");
		words.put(2, "один");
		words.put(3, "один");
		words.put(4, "один");
		words.put(5, "один");
		words.put(6, "один");
		words.put(7, "один");
		words.put(8, "один");
		words.put(9, "один");
		words.put(10, "десять");
	}
	
	public static String convert(int number) {
		return words.get(number);
	}
	
}
