package lesson140429.autoboxing;

import java.util.Hashtable;

public class Examples {

	public static void main(String[] args) {
		
		int i = 0;
		Integer oi = new Integer(10);
		System.out.println(oi.intValue());
		
		Hashtable t = new Hashtable();
		
		int a[] = new int[10];
		
		a[3] = 20;
		
		int x = a[3];
		
		t.put("John", "New-York, 5th ave");
		
		System.out.println(t.get("John"));
		
		t.put(new Integer(523), "Ivanov");
		System.out.println(t.get(new Integer(523)));
		
		t.put(525, "Petrov");
		
		System.out.println(t.get(525));
		
		System.out.println(getValue(new Integer(300)));
		
		Integer oi2 = 1000;
		
		System.out.println(oi2.byteValue());
		
		oi = new Integer(10);
		oi2 = new Integer(10);

		oi.equals(oi2);
			
	}

	private static int getValue(Integer integer) {
		
//		return integer.intValue();
		return integer; // autoboxing - автораспаковка
	}
	
}
