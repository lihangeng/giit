package Advice;

public class NaiveWaiter implements Waiter {

	@Override
	public void greetTo(String name) {
		System.out.println("greet To "+name);
	}

	@Override
	public void serverTo(String name) {
		System.out.println("server To "+name);
	}

}
