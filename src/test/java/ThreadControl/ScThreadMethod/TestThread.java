package ThreadControl.ScThreadMethod;

public class TestThread {
	final static Object syn = new Object();
	
	public static void main(String args[]) {
		new Thread() {

			@Override
			public void run() {
				System.out.println(getName()+"等待获取锁。。。。。。");
				synchronized(syn) {
					System.out.println(getName()+"获得锁。。。。。。");
					System.out.println(getName()+"进入到睡眠状态。。。。。。");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName()+"睡眠完毕。。。。。。");
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+"等待获取锁。。。。。。");
				long time = System.currentTimeMillis();
				synchronized(syn) {
					System.out.println(getName()+"获取到锁，用时："+(System.currentTimeMillis()-time));
				}
			}
		}.start();
		
	}
}
