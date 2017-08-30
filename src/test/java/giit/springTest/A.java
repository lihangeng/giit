package giit.springTest;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean {
	
	@Resource
	private B b;
	private String name;
	
	
	public A() {
		System.out.println("A initialed");
	}
	
	public void init() {
		System.out.println("init");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("set A.b");
		this.b = b;
	}

	@Override
	public String toString() {
		return super.toString()+this.name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

}
