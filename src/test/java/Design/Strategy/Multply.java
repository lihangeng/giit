package Design.Strategy;

public class Multply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp,"\\*");
		return arrayInt[0] * arrayInt[1];
	}

}
