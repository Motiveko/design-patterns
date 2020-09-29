package com.motiveko.designpatterns.structural.adapter.bird;

public class Main {

	public static void main(String[] args) {
		
		Bird sparrow = new Sparrow();
		ToyDuck plasticToyDuck = new PlasticToyDuck();
		
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		
		sparrow.makeSound();
		
		plasticToyDuck.squeak();
		
		birdAdapter.squeak();
		
	}
}
