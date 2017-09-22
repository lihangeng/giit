package giit;

public class SecurityTest {

	public static void main(String[] args) {
		SecurityManager s = new SecurityManager();
		System.setSecurityManager(s);
		SecurityManager security = System.getSecurityManager();
		if(security != null) {
			System.out.println("security is not null");
		}
		System.out.println("security:"+System.getSecurityManager());
	}

}
