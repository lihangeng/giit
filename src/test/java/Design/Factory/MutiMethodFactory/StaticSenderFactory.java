package Design.Factory.MutiMethodFactory;

import Design.Factory.SimpleFactory.MainSender;
import Design.Factory.SimpleFactory.Sender;
import Design.Factory.SimpleFactory.SmsSender;
/**
 * 简单多个静态方法工厂模式
 * @author 17051548
 *
 */
public class StaticSenderFactory {
	
	public static Sender produceMail() {
		return new MainSender();
	}
	public static Sender produceSms() {
		return new SmsSender();
	}

}
