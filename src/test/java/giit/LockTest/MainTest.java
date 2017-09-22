package giit.LockTest;

public class MainTest {

	public static void main(String[] args) {

		DieLock dlk1 = new DieLock(true);
		DieLock dlk2 = new DieLock(false);
		
		dlk1.start();
		dlk2.start();
	}

}
