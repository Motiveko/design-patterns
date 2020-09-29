package com.motiveko.designpatterns.structural.adapter.bird;

public class BirdAdapter implements ToyDuck {

	Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void squeak() {
		bird.makeSound();
	}

}
