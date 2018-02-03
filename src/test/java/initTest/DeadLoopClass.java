package initTest;

public class DeadLoopClass {
	
	static {
		if(true) {
			System.out.println(Thread.currentThread()+"init DeadLooClass");
			while(true) {
			}
		}
	}

}
