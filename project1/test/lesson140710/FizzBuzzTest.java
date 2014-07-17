package lesson140710;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

	private String _expected;
	private int _input;
	public FizzBuzzTest(String expected, int input){
		_expected = expected;
		_input = input;
		
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"1", 1},
				{"Fizz", 3},
				{"Buzz", 10},
				{"FizzBuzz", 15},
				
		});
	}
	@Test
	public void test() {

		String result = FizzBuzz.convert(1);
		assertEquals(_expected, FizzBuzz.convert(_input));
	}
}
