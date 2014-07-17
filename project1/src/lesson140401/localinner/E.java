package lesson140401.localinner;

public class E implements GivesI{
	public I getI(){
		class Local implements I{

			@Override
			public void doIt() {
				System.out.println("I did it locally");
			}
			
		}
		return new Local();
	}
}
