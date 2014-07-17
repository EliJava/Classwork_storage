package lesson140320;

public class JamesBondSuperCar extends Car implements SeaTransport, AirTransport{
	Airplane airplane = new Airplane();
	Boat boat = new Boat();
	
	@Override
	public void fly() {
		airplane.fly();
	}
	
	@Override
	public void sail() {
		boat.sail();
	}
}
