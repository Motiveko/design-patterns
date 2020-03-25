package com.designpatterns.abstractfactory.painter;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectancle::draw() method.");
	}

}
