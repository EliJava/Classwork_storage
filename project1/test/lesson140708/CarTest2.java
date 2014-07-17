package lesson140708;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest2 {
	private Car car;
	
	@Test
	public void testEngine() throws Exception {
		assertTrue(car.hasEngine());
	}

	@Before
	public void Setup(){
		car = new Car(4);
	}
	
	@Test
	public void testPower() throws Exception {
		
	}

}
