package Design.Bridge;

public class BridgeTest {

	public static void main(String[] args) {
		
		Bridge bridge = new MyBridge();

		Sourceable source = new SourceSub1();
		bridge.setSource(source);
		((MyBridge) bridge).method();
		
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		((MyBridge) bridge).method();
		
	}

}
