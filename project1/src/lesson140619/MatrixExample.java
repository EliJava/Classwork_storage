package lesson140619;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MatrixExample {

	static class RowTask implements Callable<Double> {

		private double[] _row;

		public RowTask(double[] row) {
			_row = row;

		}

		@Override
		public Double call() {
			double sum = 0;
			for (int i = 0; i < _row.length; i++) {
				sum += calculate(_row[i]);
			}
			return sum;
		}

	}

	public static void main(String[] args) {
		System.out.println("start");
		final double[][] matrix = generateMatrix(100, 100);
		
		final ExecutorService service =  
				Executors.newFixedThreadPool
				(Math.max(Runtime.getRuntime().availableProcessors()/2, 1));
		
		evaluate(new Runnable() {
			
			@Override
			public void run() {
				List<Future<Double>> futures = new LinkedList<Future<Double>>();
				for (int i = 0; i < matrix.length; i++) {
					
					Future<Double> future = service.submit(new RowTask(matrix[i]));
					futures.add(future);
				}
				double sum = 0.0;
				
				for (Future<Double> future : futures) {
					try {
						sum += future.get();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("sum = " + sum);
				
			}
			
			
			
		});
	}

	private static void evaluate(Runnable task) {
		long start = System.currentTimeMillis();

		task.run();

		long stop = System.currentTimeMillis();
		long elapsed = stop - start;
		System.out.println("Elapsed = " + elapsed);
	}

	static double calculate(double d) {
		double result = 0;
		for (int i = 0; i < 100; i++) {
			result += Math.pow(
					Math.sin(Math.pow(d, Math.E))
							/ Math.cos(Math.pow(d, Math.E)), Math.PI);
		}
		return result;
	}

	static double[][] generateMatrix(int rows, int cols) {

		double[][] matrix = new double[rows][cols];

		Random random = new Random();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextDouble();
			}
		}

		return matrix;

	}
}
