package giit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {

	public static void main(String[] args) {

		ScheduledExecutorService  scheduledThread = Executors.newScheduledThreadPool(5);
//		scheduledThread.schedule(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("delay 3 seconds");
//			}
//		}, 3, TimeUnit.SECONDS);
//		
//		scheduledThread.scheduleAtFixedRate(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("delay 3 seconds");				
//			}
//		}, 3, 3, TimeUnit.SECONDS);
	}
}
