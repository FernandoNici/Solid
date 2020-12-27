package ocp;

public class Multiplication implements CalculatorOperation {

	private double leftNumber;
	private double rightNumber;
	private double result = 0.0;

	public Multiplication(double leftNumber, double rightNumber) {
		this.leftNumber = leftNumber;
		this.rightNumber = rightNumber;
	}

	public double getLeftNumber() {
		return leftNumber;
	}

	public void setLeftNumber(double leftNumber) {
		this.leftNumber = leftNumber;
	}

	public double getRightNumber() {
		return rightNumber;
	}

	public void setRightNumber(double rightNumber) {
		this.rightNumber = rightNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}