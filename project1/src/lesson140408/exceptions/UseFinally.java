package lesson140408.exceptions;

public class UseFinally {
	public static void main(String[] args) {
		System.out.println("start");
		
		try{
			System.out.println("work");
			doSomething();
			System.out.println("work continues");
		}finally{
			System.out.println("finally");
		}
		System.out.println("finish");
	}

	private static void doSomething() {
		System.out.println("do some other work");
		
		int a = 10 / 0;
		
		System.out.println("do some other work continued");
	}
}
