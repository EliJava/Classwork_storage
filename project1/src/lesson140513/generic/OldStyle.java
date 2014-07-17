package lesson140513.generic;

import java.util.Vector;

public class OldStyle {

	//before Java 5
	
	static class A{
		
	}
	
	static class VectorOfString extends Vector{
		public boolean add(String element){
			super.add(element);
		}
		
		public String get (int index){
			return (String) super.get(index);
		}
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("one");
		v.add("two");
		v.add("three");
		v.add(10); 
		v.add(new A());
		
		
		System.out.println(v.get(1));
		System.out.println(v.get(4));
		
		String s = (String) v.get(3);
		
		VectorOfString vos = new VectorOfString();
		
		vos.add("hello");
		vos.add(10);
		
		String s2 = vos.get(0);
	}
}
