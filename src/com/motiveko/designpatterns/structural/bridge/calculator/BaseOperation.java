package com.motiveko.designpatterns.structural.bridge.calculator;

public class BaseOperation implements IBaseOperationImplementor{

	@Override
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public int substract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public int divide(int firstNumber, int secondNumber) {
		return secondNumber == 0 ? -1 : firstNumber/secondNumber;
	}

}
