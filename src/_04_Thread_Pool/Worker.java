package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue taskQueue = new ConcurrentLinkedQueue<Task>();

	Worker(taskQueue) {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
