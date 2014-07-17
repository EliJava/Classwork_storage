package lesson140708;

public class Car {
	private int wheelsCount;

	public Car(int wheels){
		wheelsCount = wheels;
	}
	
	public int getWhelsCount(){
		return wheelsCount;
	}

	public boolean hasEngine() {
		return true;
	}
}
