package JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {
	
	private Object target;

	public PerformanceHandler(Object target) {
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
		if(method.getName().equals("removeTopic")) {
			Object obj = method.invoke(target, args);
			return obj;
		}
		PerformanceMonitor.end();
		return null;
	}

}
