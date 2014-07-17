package lesson140401.localinner;

public class C implements GivesI{
	public static class StaticInner implements I {

		@Override
		public void doIt() {
			System.out.println("I did it inner statically");
		}

	}

	public I getI(){
		return new StaticInner();
	}
}
