package beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String brand;
	
	private String color;
	
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	
	private String beanName;
	
	public Car() {
		System.out.println("调用Car的构造函数");
	}
	
	public void setBrand(String brand) {
		System.out.println("调用setBrand()属性");
		this.brand = brand;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean的destory方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean的afterPropertiesSet方法");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("调用BeanNameAware的setBeanName方法+");
		this.beanName = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactoryAware的setBeanFactory方法");
		this.beanFactory = beanFactory;
	}
	
	public void myInit() {
		System.out.println("调用init-method所指定的myInit()");
		this.maxSpeed = 240;
	}
	
	public void myDestory() {
		System.out.println("调用destory-method所指定的myDestory方法");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public String getBeanName() {
		return beanName;
	}
	
	public void introduce() {
		System.out.println("brand:"+brand+"color:"+color+"maxSpeed:"+maxSpeed);
	}

}
