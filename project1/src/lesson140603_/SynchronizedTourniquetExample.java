package lesson140603_;

import java.util.Random;

import lesson140529.Utils;


public class SynchronizedTourniquetExample {
	
	static Counter counter = new Counter();
	
	static int c2;
	
	synchronized static void intCounter(){
		c2++;
	}
	
	static void intCounter2(){
		synchronized(SynchronizedTourniquetExample.class){
			c2++;
		}
	}
	
	
	//only one thread can execute code in a synced method at any given time
	
	static class Tourniquet implements Runnable{

		@Override
		public void run() {
			Random random = new Random();
			
			while(true){
				Utils.pause(2000);
				
				counter.inc();
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
