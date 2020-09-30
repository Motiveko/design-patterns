package com.motiveko.designpatterns.structural.bridge.painter;

public class DashedPainter extends Painter{

	public DashedPainter(IShape shape) {
		super(shape);
	}	
	public void advancedDraw() {
		super.draw();
		System.out.print(", border: dashded");
	}
}
