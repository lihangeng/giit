package Design.Factory.MutiMethodFactory;

import Design.Factory.SimpleFactory.MainSender;
import Design.Factory.SimpleFactory.Sender;
import Design.Factory.SimpleFactory.SmsSender;
/**
 * 简单多个方法工厂模式
 * @author 17051548
 *
 */
public class MutiMethodSenderFactory {
	
	public Sender produceMail() {
		return new MainSender();
	}
	public Sender produceSms() {
		return new SmsSender();
	}

}
