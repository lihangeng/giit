package Design.Adapter;

public class Wrapper implements Targetable {

	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
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
