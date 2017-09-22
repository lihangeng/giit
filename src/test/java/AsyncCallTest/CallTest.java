package AsyncCallTest;

public class CallTest {
	
	private String t;
	
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String Call() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "String"+t;
		
	}

}
