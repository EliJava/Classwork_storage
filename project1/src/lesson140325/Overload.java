package lesson140325;

public class Overload {
	
	int state;
	
	public void changeState(){
		state++;
	}
	
	public void changeState(int amount){
		state += amount;
	}
	
	public void changeState(boolean positive){
		if (positive){
			state++;
		} else {
			state--;
		}
	}
	
	public void changeState(boolean positive, int amount){
		if (positive){
			state += amount;
		} else {
			state -= amount;
		}
	}
}
