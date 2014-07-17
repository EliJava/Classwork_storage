package lesson140603;

public class A extends Object{
	
	private int _state;

	public A(){
		
	}
	public A(int state) {
		setState(state);
	}

	public void changeState(){
		_state *= 2;
	}
	public int getState() {
		return _state;
	}

	public void setState(int state) {
		_state = state;
	}
}
