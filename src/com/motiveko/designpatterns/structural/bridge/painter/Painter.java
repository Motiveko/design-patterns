package com.motiveko.designpatterns.structural.bridge.painter;

public class Painter {

	private IShape shape;
	
	public Painter(IShape shape) {
		this.shape = shape;
	}
	
	public void draw() {
		shape.draw();
	}
}
