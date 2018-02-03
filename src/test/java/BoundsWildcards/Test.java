package BoundsWildcards;

public class Test {

	public static void main(String[] args) {

		Plate<? extends Fruit> p = new Plate<Apple>(new Apple());
	}

}
