package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext apc = new ClassPathXmlApplicationContext("IOC/beans.xml");
		@SuppressWarnings("unused")
		Car car = apc.getBean("car", Car.class);
		System.out.println();
	}

}
