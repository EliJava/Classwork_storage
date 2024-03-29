package lesson140619;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import lesson140529.Utils;

public class CachedThreadPoolExample {

	static class Task implements Runnable {

		@Override
		public void run() {
			Utils.pause(3000);
		}

	}

	public static void main(String[] args) {

		final ThreadPoolExecutor service = (ThreadPoolExecutor) Executors
				.newCachedThreadPool();

		printStats(service);

		service.execute(new Runnable() {

			@Override
			public void run() {
				while (true) {
					Utils.pause(1000);
					printStats(service);
				}
			}
		});
		for (int i = 0; i < 20; i++) {
			service.execute(new Task());
			Utils.pause(200);
		}

	}

	public static void printStats(ThreadPoolExecutor service) {
		System.out.println();
		System.out.println(service.getPoolSize());
		System.out.println(service.getActiveCount());
	}

}
