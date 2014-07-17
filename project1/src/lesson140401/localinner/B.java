package lesson140401.localinner;

public class B implements GivesI {

	public I getI(){
		return new OuterI();
	}
}
