package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	@Override
	public Worker() {
		taskQueue= new ConcurrentLinkedQueue<Task>();
	}
	public void run() {
		// TODO Auto-generated method stub
		if(taskQueue.size()!=0) {
			taskQueue.remove().perform();
		
		}
		
	}


}
