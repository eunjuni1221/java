package ezentest;

public class Computer extends Calculator {
	
	@Override
	public double CalculatorArea(double radius) {
		return Constants.PAI_2 * radius * radius;
	}
}
