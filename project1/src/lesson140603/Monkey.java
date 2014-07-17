package lesson140603;

public class Monkey extends Animal {

	@Override
	public void makeSound() {

		System.out.println("whoop-whoop");
	}

	@Override
	public void feed(String food) {
			if (food.equals("banana")){
				makeSound();
			} else{
				
			}
	}
	
}
