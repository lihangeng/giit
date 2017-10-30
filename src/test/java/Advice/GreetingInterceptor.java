package Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		String client = args[0].toString();
		System.out.println("how are you! Mr "+client);
		Object obj = invocation.proceed();
		System.out.println("plase enjoy yourself!"+client);

		return obj;
	}


}
