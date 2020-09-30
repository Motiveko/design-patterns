package com.motiveko.designpatterns.structural.bridge.calculator;

public class OperationAbstraction {

	private IBaseOperationImplementor impl;
	
	public OperationAbstraction( IBaseOperationImplementor impl) {
		this.impl = impl;
	}
	
	public int add(int firstNumber, int secondNumber) {
		return impl.add(firstNumber, secondNumber);
	}
	public int substract(int firstNumber, int secondNumber) {
		return impl.substract(firstNumber, secondNumber);
	}
	public int multiply(int firstNumber, int secondNumber) {
		return impl.multiply(firstNumber, secondNumber);
	}
	public int divide(int firstNumber, int secondNumber) {
		return impl.divide(firstNumber, secondNumber);
	}
}
