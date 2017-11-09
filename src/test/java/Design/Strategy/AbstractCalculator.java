package Design.Strategy;

public abstract class AbstractCalculator {
	
	public int[] split(String exp,String opt) {
		
		String array[] = exp.split(opt);
		int arraryInt[] = new int[2];
		arraryInt[0] = Integer.parseInt(array[0]);
		arraryInt[1] = Integer.parseInt(array[1]);
		return arraryInt;
	}

}
