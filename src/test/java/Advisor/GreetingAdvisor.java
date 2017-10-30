package Advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class GreetingAdvisor extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return "greetTo".equals(method.getName());
	}

	@Override
	public ClassFilter getClassFilter() {
		
		return new ClassFilter() {
			public boolean matches(Class clazz) {
				return Waiter.class.isAssignableFrom(clazz);
			}
		};
	}

}
