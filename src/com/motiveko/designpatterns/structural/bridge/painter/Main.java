package com.motiveko.designpatterns.structural.bridge.painter;

public class Main {
	public static void main(String[] args) {
		
		Painter squarePainter = new DashedPainter(new Square());
		Painter trianglePainter = new DottedPainter(new Triangle());
		
		squarePainter.draw();
		System.out.println();
		trianglePainter.draw();
		System.out.println();
		
		DashedPainter dashedSquarePainter = (DashedPainter) squarePainter;
		DottedPainter dottedTrianglerPainter = (DottedPainter) trianglePainter;
		
		dashedSquarePainter.advancedDraw();
		dottedTrianglerPainter.advancedDraw();
	}
}
