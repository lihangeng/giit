package Design.Singleton;

public class Singleton {
	/*
	 * 持有私有静态实例，防止被引用，赋值为null目的是延迟加载
	 */
	private static Singleton instance = null;
	/*
	 * 私有构造方法，防止被实例化
	 */
	private Singleton() {
		System.out.println("调用了构造方法");
	}
	/**
	 * 静态工厂方法，创建实例
	 * @return
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		return  instance;
	}
	/**
	 * 如果该对象被实用于序列化，可以保证对象在序列化前后保持一致
	 * @return
	 */
	public Object readObject() {
		return instance;
	}
	

}
