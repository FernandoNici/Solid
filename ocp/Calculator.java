package ocp;

import java.security.InvalidParameterException;

public class Calculator {

	//For each requirement for adding a new functionality, we have to changing the calculate() method

	public void calculate(CalculatorOperation operation){
		if (operation == null){
			throw new InvalidParameterException("Can not perform null operation");
		}
	
		if (operation instanceof Addition) {
			Addition addition = (Addition) operation;
			addition.setResult(addition.getLeftNumber() + addition.getRightNumber());
		} else if (operation instanceof Subtraction) {
			Subtraction subtraction = (Subtraction) operation;
			subtraction.setResult(subtraction.getLeftNumber() - subtraction.getRightNumber());
		} else if (operation instanceof Division) {
			Division division = (Division) operation;
			division.setResult(division.getLeftNumber() / division.getRightNumber());
		} else if (operation instanceof Division) {
			Multiplication multiplication = (Multiplication) operation;
			multiplication.setResult(multiplication.getLeftNumber() * multiplication.getRightNumber());
		}
	}
}

