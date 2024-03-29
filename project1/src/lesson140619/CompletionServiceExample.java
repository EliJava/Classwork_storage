package lesson140619;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lesson140529.Utils;

public class CompletionServiceExample {

	static class Task implements Callable<Integer>{

		private int _id;
		private int _millis;
		public Task(int id, int millis){
			_id = id;
			_millis = millis;
			
		}
		@Override
		public Integer call() throws Exception {
			Utils.pause(_millis);
			return _id;
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();

		ExecutorCompletionService<Integer> cs = new ExecutorCompletionService<>(service);
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			cs.submit(new Task(i, random.nextInt(4000) + 3000));
		}
		
		for (int i = 0; i < 10; i++) {
			try {
				Future<Integer> future = cs.take();
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
	
}
