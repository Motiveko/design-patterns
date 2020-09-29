package com.motiveko.designpatterns.creational.abstractfactory.painter;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShpae(ShapeType shapeType) {
		if(shapeType.equals(ShapeType.RECTANGLE)) return new Rectangle(); 
		else if(shapeType.equals(ShapeType.SQUARE)) return new Square();
	
		return null;
	}

}
