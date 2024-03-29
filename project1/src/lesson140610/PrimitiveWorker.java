package lesson140610;

import java.util.LinkedList;
import java.util.Queue;

import lesson140529.Utils;

public class PrimitiveWorker  {
	private static final Runnable POISON_PILL = new Runnable() {
		
		@Override
		public void run() {
			
		}
	};
	
	final private Queue<Runnable> _tasks = new LinkedList<Runnable>();

	private class WorkerTask implements Runnable{
		@Override
		public void run() {
			Runnable task;
			while (true) {
				synchronized (_tasks) {
					
					while (!hasNewTask()) {
						try {
							_tasks.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					task = _tasks.poll();
				}
				if(task == POISON_PILL){
					break;
				}
				
				try{
					task.run();
				}catch (Throwable e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public PrimitiveWorker(){
		new Thread(new WorkerTask()).start();
	}
	

	private boolean hasNewTask() {

		return !_tasks.isEmpty();
	}

	public void execute(Runnable task) {
		synchronized (_tasks) {
			_tasks.offer(task);
			_tasks.notify();
			System.out.println("added task");
		}
	}
	
	//poison pill
	public void shutdown(){
		execute(POISON_PILL);
	}
}