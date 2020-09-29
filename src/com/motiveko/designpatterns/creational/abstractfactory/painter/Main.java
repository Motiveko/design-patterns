package com.motiveko.designpatterns.creational.abstractfactory.painter;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory factory = FactoryProducer.createFactory(true);
		
		Shape shape1 = factory.getShpae(ShapeType.RECTANGLE);
		Shape shape2 = factory.getShpae(ShapeType.SQUARE);
		
		factory = FactoryProducer.createFactory(false);
		
		Shape shape3 = factory.getShpae(ShapeType.RECTANGLE);
		Shape shape4 = factory.getShpae(ShapeType.SQUARE);
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		shape4.draw();
	}
}
