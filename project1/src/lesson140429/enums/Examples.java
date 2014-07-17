package lesson140429.enums;

public class Examples {
	
	enum Apple{
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}
	
	enum –усскиеяблоки{
		—емеренко(10), јнтоновка(15), —лаваѕобедителю(20);
		
		private int цена;
		
		–усскиеяблоки(int цена){
			this.цена = цена;
		}
		
		public int стоимость(){
			return цена;
		}
	}
	
	public static void main(String[] args) {
		
		Apple ap = Apple.Jonathan;
		
		System.out.println(ap.name());
		System.out.println(Apple.RedDel.ordinal());
		
		switch(ap){
			
		case Jonathan:
			break;
		case RedDel:
			break;
		
		}
		
		for (Apple apple : Apple.values()) {
			System.out.println(apple.name() + " " + apple.ordinal());
			
		}
		
		for (–усскиеяблоки сортяблок : –усскиеяблоки.values()){
			System.out.println(сортяблок.name() + " " + сортяблок.стоимость());
		}
	}
}
