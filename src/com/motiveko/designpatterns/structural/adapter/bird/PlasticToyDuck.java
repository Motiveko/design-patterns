package com.motiveko.designpatterns.structural.adapter.bird;

public class PlasticToyDuck implements ToyDuck {

	@Override
	public void squeak() {
		System.out.println("PlaticToyDuck squeak!");
	}
}
