package lesson140710;

public class FizzBuzz {

	public static String convert(int number) {
		
		String result;
		
		if (number % 3 == 0 && number % 5 == 0){
			result = "FizzBuzz";
		}else if (number % 3 == 0){
			result = "Fizz";
		}else if(number % 5 == 0)
		{
			result = "Buzz";
		}else{
			result = Integer.toString(number);
		}
		
		return result;
	}
	//%3 fizz %5buzz %3%5fizzbuzz else ''
}
