package lesson140610;

import java.util.LinkedList;
import java.util.Queue;

import lesson140529.Utils;

public class Worker {
	private static final Runnable POISON_PILL = new Runnable() {

		@Override
		public void run() {

		}
	};

	final private BlockingQueue<Runnable> _tasks = new BlockingQueue<Runnable>();

	private class WorkerTask implements Runnable {
		@Override
		public void run() {
			Runnable task;
			while (true) {

				task = _tasks.poll();

				if (task == POISON_PILL) {
					break;
				}

				try {
					task.run();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}

	}

	public Worker() {
		new Thread(new WorkerTask()).start();
	}

	public void execute(Runnable task) {

		_tasks.offer(task);

	}

	// poison pill
	public void shutdown() {
		execute(POISON_PILL);
	}
}