package lesson140610;

import lesson140529.Utils;


public class AlwaysBlockingExample {

	static final Object mutex = new Object();
	
	public static void main(String[] args) {
	new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("start complex job");
				synchronized (mutex) {
					while(true){}
				}
			}
		}).start();
		
		Utils.pause(1000);
		
		System.out.println("trying to lock mutex");
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (mutex) {
					System.out.println("hello thar");
				}
			}
		});
		
		thread.start();
		Utils.pause(1000);
		
		thread.interrupt();
		
		thread.stop();
	}
	
}
