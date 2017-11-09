package Design.Facade;

public class User {

	public static void main(String[] args) {
		Computer compter = new Computer();
		compter.startup();
		compter.shutdown();
	}

}
