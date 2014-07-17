package lesson140515.generic.restrictions;

public class Statics<T> {
	static T t;
	
	static void print(T t){
		
	}
	
	static <V> void print(V v){
		System.out.println(v);
	}
}
