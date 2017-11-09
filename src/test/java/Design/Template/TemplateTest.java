package Design.Template;

import java.util.Vector;

public class TemplateTest {

	public static void main(String[] args) {

		String exp = "2+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculator(exp, "\\+");
		System.out.println(result);
	}

}
