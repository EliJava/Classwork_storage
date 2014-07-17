package lesson140603;

public class Cat extends Pet {

	@Override
	public void makeSound() {
		System.out.println("Nyah");
	}

	@Override
	public void feed(String food) {
		makeSound();
	}

}
