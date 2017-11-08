package Design.Factory;

import Design.Factory.Factory.Provider;
import Design.Factory.Factory.SenderMailFactory;
import Design.Factory.MutiMethodFactory.MutiMethodSenderFactory;
import Design.Factory.SimpleFactory.Sender;
import Design.Factory.SimpleFactory.SimpleSenderFactory;

public class FactoryTest {

	public static void main(String[] args) {
		SimpleSenderFactory simpleFactory = new SimpleSenderFactory();
		Sender sender = simpleFactory.Senderproduce("mail");
		sender.sender();
		
		MutiMethodSenderFactory mutiMethodFactory = new MutiMethodSenderFactory();
		Sender sender2 = mutiMethodFactory.produceSms();
		sender2.sender();
		
		Provider factory2 = new SenderMailFactory();
		Design.Factory.Factory.Sender sender3 = factory2.produce();
		sender3.Sender();
	}

}
