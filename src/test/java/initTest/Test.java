package initTest;

public class Test {

	public static void main(String[] args) {
		Son son = new Son();
	}

}

class Parent{
	{
		System.out.println("parent中的初始化块");
	}
	static {
		System.out.println("parent中的static初始化块");
	}
	public Parent() {
		System.out.println("parent构造方法");
	}
}

class Son extends Parent{
	{
		System.out.println("son中的初始化块");
	}
	static{
		System.out.println("son中的static初始化块");
	}
	public Son() {
		System.out.println("son构造方法");
	}
	
}
