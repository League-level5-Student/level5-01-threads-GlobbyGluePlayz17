package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable {
	
	private int threadnum;

	ThreadedGreeter(int threadnum) {
		this.threadnum = threadnum;
	}

	@Override
	public void run() {
		System.out.println("Hello from thread number: " + threadnum);
		if (threadnum < 50) {
			Thread newe = new Thread(new ThreadedGreeter(threadnum+1));
			newe.start();
			try {
				newe.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
