package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

	private Star realStar;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
		Object object = null;
		System.out.println("真实角色调用之前的处理......");
		if(method.getName().equals("sing")) {
			object = method.invoke(realStar, args);
		}
		System.out.println("真实角色调用之后的处理");
		return null;
	}
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

}
