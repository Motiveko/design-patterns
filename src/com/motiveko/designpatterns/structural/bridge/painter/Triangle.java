package com.motiveko.designpatterns.structural.bridge.painter;

public class Triangle implements IShape{
	@Override
	public void draw() {
		System.out.print("Draw :: Triangle");
	}
}
