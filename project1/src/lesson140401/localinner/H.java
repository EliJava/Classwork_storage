package lesson140401.localinner;

public class H implements Changeable {

	int state = 10;
	/* (non-Javadoc)
	 * @see lesson140401.localinner.Changeable#changeState()
	 */
	@Override
	public void changeState(){
		state *= 20;
	}
	@Override
	public Object getState() {
		return state;
	}
	
}
