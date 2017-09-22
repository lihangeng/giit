package InnerClassTest;

public class MainTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal.Dog dog = animal.new Dog();
		animal.run();
		dog.show();
	}

}
