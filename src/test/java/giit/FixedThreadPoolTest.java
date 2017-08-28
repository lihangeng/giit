package giit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+":"+index);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				
			});
		}
	}

}
