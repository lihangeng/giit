package activemq;

import javax.jms.JMSException;

public class Test {

	public static void main(String[] args) throws Exception {

		JmsSender sender = new JmsSender();
		JmsReceiver receiver = new JmsReceiver();
		sender.sendMessage("bytes");
		sender.close();
		Thread.sleep(5000);
		receiver.receiveMessage();
		receiver.close();
	}

}
