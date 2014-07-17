package lesson140408.exceptions;

import java.util.Random;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		try{
			a = 10;
			System.out.println("a = " + a);
			doSomething();
			System.out.println("a = " + a);
		}catch(RuntimeException e){
			System.out.println("runtime");
			a = 20;
			System.out.println("a = " + a);
		}catch(Exception e){
			System.out.println("exception");
			a = 25;
			System.out.println("a = " + a);
		}finally{
			a = 30;
			System.out.println("a = " + a);
		}
		
		System.out.println("a = " + a);
	}

	private static void doSomething() throws Exception {
		Random r = new Random();
		if(r.nextInt(2) == 0){
			throw new RuntimeException();
		}else{
			throw new Exception();
		}
	}
	
}
