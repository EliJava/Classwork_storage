package lesson140619;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import lesson140529.Utils;

public class ExecutorsExample {

	private static final class Task implements Runnable{
		@Override
		public void run() {
			System.out.println("Hello from " + Thread.currentThread().getName());
			Utils.pause(5000);
			System.out.println("bye from " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		service.execute(new Task());
		service.execute(new Task());

		service.shutdown();
		
//		service.shutdownNow();
		
		try {
			service.awaitTermination(1, TimeUnit.HOURS);
			System.out.println("finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
