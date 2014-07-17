package lesson140603_;

public class Counter {

		private int counter;
		
		public void inc(){
			synchronized(this){ //mutex
				//mutual exclusion
				counter++;
				System.out.println(Thread.currentThread().getName() + ": " + counter);
			}
		}
		
		public void mul(){
			synchronized(this){
				counter *= 2;
			}
		}
		
		public int get(){
			return counter;
		}
	
}
