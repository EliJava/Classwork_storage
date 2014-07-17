package lesson140710;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermostatTest {

	Thermostat term = new Thermostat();
	
	@Test
	public void testDefaultTemperature() {
		assertEquals(20, term.temperature);
	}
	
	@Test
	public void testHasListener(){
		assertNull(term.listener);
		term.setListener(new TermListener(){
			
		});
		assertNotNull(term.listener);
	}
	@Test
	public void testInc() {
		term.inc();
		assertEquals(21, term.temperature);
	}

}
