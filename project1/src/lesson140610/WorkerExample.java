package lesson140610;

import lesson140529.Utils;


public class WorkerExample {

	public static void main(String[] args) {
		System.out.println("start");
		
//		PrimitiveWorker worker = new PrimitiveWorker();
		Worker worker = new Worker();

		
		
		class Task implements Runnable{

			@Override
			public void run() {
				System.out.println("start task");
				Utils.pause(5000);
				System.out.println("finish task");
				throw new RuntimeException();
			}
			
		}
		
		worker.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from " + Thread.currentThread());
			}
		});
		worker.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Another hello from " + Thread.currentThread());
			}
		});
		
		System.out.println("task 1");
		worker.execute(new Task());
		Utils.pause(1000);
		System.out.println("task 2");
		worker.execute(new Task());
		System.out.println("finished");
		
		worker.shutdown();
	}
}
