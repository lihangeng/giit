package initTest;

public class Test2 {

	public static void main(String[] args) {
		 
		Runnable test = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread()+"start");
				DeadLoopClass dlc = new DeadLoopClass();
				System.out.println(Thread.currentThread()+"END");
			}
		};
		
		Thread thread1 = new Thread(test);
		Thread thread2 = new Thread(test);
		thread1.start();
		thread2.start();
	}
}
