package lesson140327.inner;

public class A {

	class Ai{
		public void printState(){
			System.out.println(state);
			System.out.println(this);
			System.out.println(A.this);
		}
	}
	
	int state = 10;
	
}
