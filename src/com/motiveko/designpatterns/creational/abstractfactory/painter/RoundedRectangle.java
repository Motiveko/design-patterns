package com.motiveko.designpatterns.creational.abstractfactory.painter;

public class RoundedRectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method");
	}

	
}
