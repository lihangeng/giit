package JDKProxy;

import java.lang.reflect.Proxy;

public class TestRForumService {

	public static void main(String[] args) {
		ForumService target = new ForumServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(target);
		ForumService proxy =(ForumService)Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				handler);
		proxy.removeTopic(123);
		proxy.removeForum(321);
		
		
		CglibProxy proxy2 = new CglibProxy();
		ForumService forumService = (ForumServiceImpl)proxy2.getProxy(ForumServiceImpl.class);
		forumService.removeTopic(666);
		forumService.removeForum(999);
	}

}
