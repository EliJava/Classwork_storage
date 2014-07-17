package lesson140529;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadAndExceptions {
	public static void main(String[] args) {
		System.out.println("start");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println(Thread.currentThread().getName());
					Utils.pause(1000);
				}
			}
		}).start();
		
//		Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("bad exc caught");
			}
		});
		
		if(args.length == 0){
			throw new RuntimeException();
		}
		
		
		
		
		System.out.println("finish");
	}
}
