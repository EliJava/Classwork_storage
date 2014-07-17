package lesson140603;

public abstract class Animal {

	public abstract void makeSound();
	public abstract void feed(String food);
	
	public void takeCare(){
		makeSound();
		feed("banana");
		feed("meat");
		
	
	}
}
