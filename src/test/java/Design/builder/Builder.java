package Design.builder;

import java.util.ArrayList;
import java.util.List;

import Design.Factory.Factory.MailSender;
import Design.Factory.Factory.Sender;
import Design.Factory.Factory.SmsSender;

public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for(int i=0;i<count;i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count) {
		for(int i=0;i<count;i++) {
			list.add(new SmsSender());
		}
	}

}
