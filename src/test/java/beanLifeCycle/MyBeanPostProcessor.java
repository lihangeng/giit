package beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("car".equals(beanName)) {
			Car car = (Car)bean;
			if(car.getColor() == null) {
				System.out.println("设置color默认为黑色");
				car.setColor("黑色");
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("car".equals(beanName)) {
			Car car =(Car)bean;
			if(car.getMaxSpeed()>200) {
				System.out.println("将Maxspeed调整为200");
				car.setMaxSpeed(200);
			}
		}
		return bean;
	}

}
