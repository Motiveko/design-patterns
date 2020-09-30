package com.motiveko.designpatterns.structural.bridge.calculator;

public class Main {

	public static void main(String[] args) {
		
		int firstNumber = 10;
		int secondNumber = 2;
		
		OperationAbstraction operationAbstraction = new RefinedOperationAbstraction(new BaseOperation());
		
		System.out.println(operationAbstraction.add(firstNumber, secondNumber));
		System.out.println(operationAbstraction.substract(firstNumber, secondNumber));
		System.out.println(operationAbstraction.multiply(firstNumber, secondNumber));
		System.out.println(operationAbstraction.divide(firstNumber, secondNumber));
		
		RefinedOperationAbstraction refinedOperationAbstraction = (RefinedOperationAbstraction) operationAbstraction;
		
		System.out.println(refinedOperationAbstraction.sqrt(firstNumber));
		System.out.println(refinedOperationAbstraction.pow(firstNumber, secondNumber));
		
	}
}
