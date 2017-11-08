package Design.Factory.SimpleFactory;

public class SmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("this is smsSender!");
	}

}
