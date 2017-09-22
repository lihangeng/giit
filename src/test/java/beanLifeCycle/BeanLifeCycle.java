package beanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("beanLifeCycle/bean.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantinationAwareBeanPostProcessor());
		
		Car car1 = (Car)bf.getBean("car");
		car1.introduce();
		Car car2 = (Car)bf.getBean("car");
		System.out.println("car1==car2:"+(car1==car2));
		((XmlBeanFactory)bf).destroySingletons();
	}

}
