package lesson140701;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import lesson140529.Utils;


public class TourniquetExample {
	
	static AtomicInteger counter = new AtomicInteger(0);
	
	static class Tourniquet implements Runnable{

		@Override
		public void run() {
			Random random = new Random();
			
			while(true){
//				Utils.pause(2000 + random.nextInt(3000));
				Utils.pause(2000);
				
//				counter++;
//				int tmp = counter;
//				int tmp2 = tmp + 1;
//				counter = tmp2;
				
				int currentValue = counter.incrementAndGet();
				
				System.out.println(Thread.currentThread().getName() + ": " + counter);
			}
		}
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Thread(new Tourniquet()).start();
		}
		
//		while(true){
//			Utils.pause(1000);
//			System.out.println(counter);
//		}
	}
}
