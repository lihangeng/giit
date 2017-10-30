package Advice;

import java.io.Serializable;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvice implements Serializable{

	public static void main(String[] args) {
//		Waiter waiter = new NaiveWaiter();//目标类
//		BeforeAdvice advice = new GreetingBeforeAdvice();
//		ProxyFactory pf = new ProxyFactory();
//		pf.setInterfaces(waiter.getClass().getInterfaces());
//		pf.setOptimize(true);
//		pf.setTarget(waiter);
//		pf.addAdvice(advice);
        String configPath = "Advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService proxy = (ForumService)ctx.getBean("forumService");
//		proxy.greetTo("james");
//		proxy.serverTo("james");
        Forum forum = new Forum();
        proxy.removeForum(1);
        try {
			proxy.updateForum(forum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
