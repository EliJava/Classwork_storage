package tetris;

public class Logic {

	public State state;

	public Logic(State state) {
		this.state = state;
	}

	public void moveLeft() {
		if(state.getFigureColumn() == 0){
			return;
		}
		state.moveFigureLeft();
	}

	public void MoveRight() {
		//homework
		// TODO Auto-generated method stub
		
	}

	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	public void dropDown() {
		// TODO Auto-generated method stub
		
	}

	public void slideDownOneRow() {
		// TODO Auto-generated method stub
		
	}


}
