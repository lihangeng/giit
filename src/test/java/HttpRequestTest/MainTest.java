package HttpRequestTest;

public class MainTest {

	public static void main(String[] args) {

		String s = HttpRequest.setPut("http://sitpayemp.cnsuning.com/epp-emp/sys/menu/menu-info!doFirstMenu.action", "id=1061&menuName=清结算管理");
		System.out.println(s);
	}

}
