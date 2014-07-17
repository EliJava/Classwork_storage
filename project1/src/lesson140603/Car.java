package lesson140603;

abstract public class Car extends Vehicle {

	Engine _engine;
	Wheel[] _wheels;
	
	public Car(Engine engine, Wheel[] wheels){
		_engine = engine;
		_wheels = wheels;
		
		mountWheels();
	}
	
	private void mountWheels() {

		for (int i = 0; i < _wheels.length; i++) {
			_wheels[i] = createWheel();
		}
	}

	protected Wheel createWheel() {
		
		return null;
	}

	@Override
	public void moveTo(int x, int y) {
		startEngine();
		pushAccelerator();
		drive();
		stopEngine();
		
	}

	private void stopEngine() {
		_engine.stop();
		System.out.println("engine stopped");
	}

	private void drive() {
		System.out.println("started moving");
		for (int i = 0; i < _wheels.length; i++) {
			_wheels[i].makeSound();
		}
	}

	private void pushAccelerator() {
		System.out.println("pushed accel");
		
	}

	private void startEngine() {
		_engine.start();
		System.out.println("start engine");
		
	}
}
