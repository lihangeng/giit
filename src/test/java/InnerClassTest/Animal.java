package InnerClassTest;

public class Animal {
	
	private String name = "animal";
	
	public void run() {
		System.out.println("run");
		Dog dog = new Dog();
		dog.show();
	}

	class Dog{
		public void show() {
			System.out.println(name);
		}
	}
}
