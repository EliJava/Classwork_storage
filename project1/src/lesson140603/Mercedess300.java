package lesson140603;

public class Mercedess300 extends Car {

	public Mercedess300() {
		super(new Mers30(), new Wheel[4]);
	}

	@Override
	protected Wheel createWheel() {
		return new Michelin();
	}
	
}
