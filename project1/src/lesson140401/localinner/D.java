package lesson140401.localinner;

public class D implements GivesI{
	public class Inner implements I {

		@Override
		public void doIt() {
			System.out.println("I did it from inside");
		}

	}

	public I getI(){
		return new Inner();
	}
}
