package lesson140515.generic.restrictions;

public class Exceptions {
	
	static class MyException<T> extends Exception{
		
	}
	
	static class Parser<T extends Exception>{
		public void parse(File file) throws T{
			
		}
	}
}
