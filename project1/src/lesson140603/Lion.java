package lesson140603;

public class Lion extends Animal {

	@Override
	public void makeSound() {

		System.out.println("RROOOOAR");
		
	}

	@Override
	public void feed(String food) {
			if (food.equals("meat")){
				makeSound();
			} else{
				
			}
	}
	

}
