package com.designpatterns.abstractfactory.painter;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShpae(ShapeType shapeType) {
		if(shapeType.equals(ShapeType.RECTANGLE)) return new RoundedRectangle();
		else if(shapeType.equals(ShapeType.SQUARE)) return new RoundedSquare();
		return null;
	}

}
