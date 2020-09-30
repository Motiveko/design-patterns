package com.motiveko.designpatterns.structural.bridge.painter;

public class DottedPainter extends Painter{

	public DottedPainter(IShape shape) {
		super(shape);
	}
	
	public void advancedDraw() {
		super.draw();
		System.out.print(", border : dotted");
	}
}
