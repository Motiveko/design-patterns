package com.motiveko.designpatterns.structural.bridge.painter;

public class Square implements IShape{
	@Override
	public void draw() {
		System.out.print("Draw :: Sqaure");
	}
}
