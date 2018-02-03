package Design.tempateTest;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {
		System.out.println("调用构造方法");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}

}
