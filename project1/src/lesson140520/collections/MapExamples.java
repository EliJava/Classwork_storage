package lesson140520.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapExamples {

	public static void main(String[] args) {
		Map<String, String> calls = new HashMap<>();
		
		process(calls);
		
		Map<String, String> calls2 = new TreeMap<>();
		
		process(calls2);
		
		Map<String, String> calls3 = new LinkedHashMap<>();
		
		process(calls);
		
		String city = calls2.get("12:06");
		
		System.out.println(city);
	}

	private static void process(Map<String, String> calls) {
		System.out.println("----------------");
		fillMap(calls);
		
		for (Entry<String, String> call : calls.entrySet()) {
			System.out.println(call.getKey() + "->" + call.getValue());
		}
	}

	private static void fillMap(Map<String, String> calls) {
		calls.put("09:34", "Moscow");
		calls.put("12:06", "St. Pete");
		calls.put("14:20", "New-York");
		calls.put("07:00", "Boston");
		calls.put("21:30", "Samara");
		calls.put("16:03", "Tehran");
		calls.put("23:00", "Rio");
		calls.put("14:59", "Boston");
		calls.put("11:00", "St. Pete");
	}
	
}
