package com.motiveko.designpatterns.creational.abstractfactory.painter;

public class RoundedSquare implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method");
	}

}
