package lesson140513.generic;

import lesson140513.generic.GenericExample.Box;


public class TwoTypeParameters {

	interface Pair<K, V>{
		K getKey();
		V getValue();
	}
	
	static class ConcretePair<KEY, VALUE> implements Pair<KEY, VALUE>{

		private KEY key;
		private VALUE value;
		
		@Override
		public KEY getKey() {
			return key;
		}

		@Override
		public VALUE getValue() {
			return value;
		}
		
	}
	
	static class IntegerStringPair implements Pair<Integer, String>{

		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getValue() {
			// TODO Auto-generated method stub
			return null;
		}		
	}
	
	static class IntegerSomethingPair<Value> implements Pair<Integer, Value> {

		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Value getValue() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		ConcretePair<Integer, Float> p1 = new ConcretePair();
		
		IntegerStringPair p2 = new IntegerStringPair();
		
		IntegerSomethingPair<Runnable> p3 = new IntegerSomethingPair<>();
		IntegerSomethingPair<String> p4 = new IntegerSomethingPair<>();
		
		ConcretePair<Integer, Box<String>> p5 = new ConcretePair<>();
		
		Box<String> b = new Box<>();
		
		b.set("hello");
		
		p5.key = 10;
		
		p5.value = b;
		
	}
}
