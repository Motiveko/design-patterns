package com.motiveko.designpatterns.structural.adapter.bird;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void makeSound() {
		System.out.println("Sparrow make noise!");
	}
}
