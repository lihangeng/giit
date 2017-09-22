package Proxy;

public class RealStar implements Star {

	@Override
	public void confer() {

		System.out.println("EXO.confer()");
	}

	@Override
	public void signContract() {

		System.out.println("EXO.signContract");
	}

	@Override
	public void bookTicket() {

		System.out.println("EXO.bookTicket");
	}

	@Override
	public void sing() {
		
		System.out.println("EXO.sing");
	}

	@Override
	public void collectMony() {

		System.out.println("EXO.collectMony");
	}

}
