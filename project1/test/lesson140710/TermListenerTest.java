package lesson140710;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermListenerTest {
	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	@Test
	public void test() {
		final TermListener mockListener = context.mock(TermListener.class);
		
		
		Thermostat term = new Thermostat();
		
		term.setListener(mockListener);
		context.checking(new Expectations(){
			{
				oneOf(mockListener).temperatureChanged(with(any(int.class)));
			}
		});
		
		term.inc();
	}

}
