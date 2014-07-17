package lesson140701;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVsSync {

	static class Counter{
		volatile int count;
		
		public int get(){
			return count;
		}
		
		synchronized public int inc(){
			return ++count;
		}
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Counter c = new Counter();
				long start = System.currentTimeMillis();
				for (int i = 0; i < 100000000; i++) {
					c.inc();
				}
				long stop = System.currentTimeMillis();
				System.out.println("Elapsed = " + (stop - start));
			}
		});
		
		thread.start();
		try {
			thread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				AtomicInteger c = new AtomicInteger();
				long start = System.currentTimeMillis();
				final int MAX_ITERATIONS = 100000000;
				for (int i = 0; i < MAX_ITERATIONS; i++) {
					c.incrementAndGet();
				}
				long stop = System.currentTimeMillis();
				System.out.println("Elapsed = " + (stop - start));
			}
		});
		
		thread.start();
		
	}
	
}
