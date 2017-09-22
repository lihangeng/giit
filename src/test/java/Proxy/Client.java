package Proxy;

import java.lang.reflect.Proxy;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Star realStar = new RealStar();
		
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class}, handler);
		proxy.sing();
		
		@SuppressWarnings("rawtypes")
		Class clazz = realStar.getClass();
		System.out.println();
		
		clazz.getClassLoader();
		
		Object o = new Object();
	}

}
