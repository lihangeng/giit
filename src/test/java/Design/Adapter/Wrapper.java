package Design.Adapter;

public class Wrapper implements Targetable {

	
	private Source source;
	
	public Wrapper(Source source) {
		super();
	}
	
	@Override
	public void method1() {
		System.out.println("this is targetable method!");
	}

	@Override
	public void method2() {
		source.method1();
	}



}
