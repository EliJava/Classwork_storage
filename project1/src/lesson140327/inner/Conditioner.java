package lesson140327.inner;

public class Conditioner implements TemperatureObserver {

	@Override
	public void currentTemp(int temp) {
		if (temp > 25){
			hot();
		}
		
		if (temp < 20){
			cold();
		}
		
	}
	public void hot() {
		System.out.println("cond on");
	}

	public void cold() {
		System.out.println("cond off");
	}

	public static void main(String[] args) {
		Conditioner c = new Conditioner();
		Thermometer t = new Thermometer();
		
		t.setObserver(c);
		
		t.inc();
		t.inc();
		t.inc();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		
		t.setObserver(new TemperatureObserver() {
			
			@Override
			public void currentTemp(int temp) {
				System.out.println("it's raining men");
			}
		});
		
		t.inc();
		t.dec();
	}

}
