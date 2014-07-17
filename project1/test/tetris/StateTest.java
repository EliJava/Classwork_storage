package tetris;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StateTest {

	private State _state;

	@Before
	public void setup(){
		_state = new State();
	}
	@Test
	public void testHasField() {
		assertNotNull(_state.field);
		assertTrue(_state.field instanceof Field);
	}

	@Test
	public void testHasFigure() throws Exception {
		assertNotNull(_state.figure);
	}
	
	@Test
	public void testFigureLocation() throws Exception {
		assertEquals(0, _state.figureRow);
		int column = _state.getColumn();
		assertEquals(column, _state.figureColumn);
	}
}
