package lesson140603;

public class Zoo {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		Monkey monkey = new Monkey();
//		Animal animal = new Animal(); error - abstract
		
		lion.takeCare();;
//		takeCare(monkey);
		new Cat().takeCare();;
//		takeCare(new Dog());
		
	}
	
	
}
