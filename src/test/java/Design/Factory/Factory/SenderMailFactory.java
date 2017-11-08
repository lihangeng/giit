package Design.Factory.Factory;

public class SenderMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
