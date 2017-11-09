package Design.Adapter;

public class AdapterTest {

	public static void main(String[] args) {

		Targetable target = new Adapter();
		target.method1();
		target.method2();
		
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}
