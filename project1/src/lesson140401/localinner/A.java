package lesson140401.localinner;

public class A implements I, GivesI{
	
	public I getI(){
		return this;
	}

	@Override
	public void doIt() {
		System.out.println("I did it by myself");
	}
}
