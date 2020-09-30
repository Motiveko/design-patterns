package com.motiveko.designpatterns.structural.bridge.calculator;

// Abstraction의 기본 기능에 확장되는 기능을 추가하는 객체 
public class RefinedOperationAbstraction extends OperationAbstraction{

	public RefinedOperationAbstraction(IBaseOperationImplementor impl) {
		super(impl);
	}
	
	public int sqrt(int a) {
		return (int) Math.sqrt(a);
	}
	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}
}
