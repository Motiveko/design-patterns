package com.motiveko.designpatterns.structural.bridge.calculator;

// Abstraction클래스의 기본 역할인 Api를 정의한 interface, 브릿지 역할을 담당한다.
public interface IBaseOperationImplementor {

	public abstract int add(int firstNumber, int secondNumber);
	public abstract int substract(int firstNumber, int secondNumber);
	public abstract int multiply(int firstNumber, int secondNumber);
	public abstract int divide(int firstNumber, int secondNumber);
	
}
