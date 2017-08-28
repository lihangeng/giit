package giit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
			final int index = i;
			cachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+index);
					System.out.println();
				}
				
			}); 
			cachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+index);
					System.out.println();
				}
				
			}); 
		}
	}

}
