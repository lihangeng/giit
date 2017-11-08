package Design.Factory.SimpleFactory;

/**
 * 简单普通工厂模式
 * @author 17051548
 *
 */
public class SimpleSenderFactory {
	
	public Sender Senderproduce(String type) {
		if("mail".equals(type)) {
			return new MainSender();
		}else if("sms".equals(type)) {
			return new SmsSender();
		}else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}
}
