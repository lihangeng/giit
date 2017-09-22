package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("IOC/beans.xml");
		Car car = apc.getBean("car", Car.class);
	}

}
