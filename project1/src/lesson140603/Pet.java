package lesson140603;

public abstract class Pet extends Animal {

	public void brush(){
		System.out.println("brushed");
	}
	
	@Override
	public void takeCare() {
		super.takeCare();
		brush();
	}
}
