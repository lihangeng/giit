package Test;

public class TestMain {

	public static void main(String[] args) {

		boolean isRight = 1>2;
		try {
			assert isRight:"程序错误";
		System.out.println("程序正常");
		}catch(AssertionError e) {
			e.printStackTrace();
			System.out.println("123");
		}
	}

}
