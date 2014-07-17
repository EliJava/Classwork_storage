package lesson140327.inner;

public class S {

	private static int counter;
	private static class Si{
		public void print(){
			System.out.println("static inner, counter = " + S.getCounter());
		}
	}
	
	private static int getCounter(){
		return counter;
	}
	private int state;
	private Si si;
	
	public S(){
		counter++;
		si = new Si();
	}
	
	public int getState(){
		return state;
	}
	
	public void print(){
		si.print();
	}
}
