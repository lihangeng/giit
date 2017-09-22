package giit.LockTest;

public class DieLock extends Thread{
	
	private boolean flag; 
	
	DieLock(boolean flag){
		this.flag = flag;
	}
	@Override
	public void run() {
		if(flag) {
			synchronized(MyLock.objA) {
				System.out.println("objA");
			    synchronized(MyLock.objB) {
				   System.out.println("objB");
			}
		}
		}else {
			synchronized(MyLock.objB) {
				System.out.println("objB");
			
			synchronized(MyLock.objA) {
				System.out.println("objA");
			}
			}
		}
		
	}
	
	

}
