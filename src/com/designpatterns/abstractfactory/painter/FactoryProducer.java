package com.designpatterns.abstractfactory.painter;

public class FactoryProducer {

	public static AbstractFactory createFactory(boolean isRounded) {
		if(isRounded) return new RoundedShapeFactory();
		else return new ShapeFactory();
	}
}
