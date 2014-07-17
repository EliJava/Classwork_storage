package lesson140603.vehicle;

import lesson140603.Car;
import lesson140603.Engine;
import lesson140603.LadaKalina;
import lesson140603.Mercedess300;
import lesson140603.Wheel;



public class TestDrive {
	public static void main(String[] args) {
		LadaKalina lada = new LadaKalina();
		
		lada.moveTo(10, 20);
		
		
		
		Mercedess300 mers = new Mercedess300();
		
		mers.moveTo(10, 20);
	
		//Car car = new Car(new Engine(), new Wheel[0]);
	}
}
