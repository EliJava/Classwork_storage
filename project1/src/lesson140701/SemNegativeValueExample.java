package lesson140701;

import java.util.concurrent.Semaphore;

import lesson140529.Utils;

public class SemNegativeValueExample {

	public static void main(String[] args) {
		
		final Semaphore sem = new Semaphore(-2);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				sem.acquireUninterruptibly();
				System.out.println("hello thar");
			}
		}).start();
		
		System.out.println("start");
		
		Utils.pause(1000);
		sem.release();
		Utils.pause(1000);
		sem.release();
		Utils.pause(1000);
		sem.release();
	}
	
}
