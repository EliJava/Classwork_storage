package lesson140513.generic;

public class GenericExample {

	/*
	 * E - element
	 * K - key
	 * N - number
	 * T - type
	 * V - value
	 * S,U,X...
	 * 
	 * 
	 */
	static class Box<E>{ //generic class (type)
		private E object;

		public E get() {
			return object;
		}

		public void set(E object) {
			this.object = object;
		}
	}
	
	public static void main(String[] args) {
		Box<String> box = new Box<>(); //parameterized type
		
		box.set("hello");
		
		String s = box.get();
	}
	
}
