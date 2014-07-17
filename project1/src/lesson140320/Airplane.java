package lesson140320;

public class Airplane implements AirTransport {
	
	/* (non-Javadoc)
	 * @see lesson140320.AirTransport#fly()
	 */
	@Override
	public void fly(){
		System.out.println("flying");
	}
}
