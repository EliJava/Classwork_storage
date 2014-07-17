package lesson140708;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	private Car car;

	@Test
	public void test() {
		Car car = new Car(4);
		assertEquals(4, car.getWhelsCount());
		Car car2 = new Car(6);
		assertEquals(6, car2.getWhelsCount());
		
	}

}
