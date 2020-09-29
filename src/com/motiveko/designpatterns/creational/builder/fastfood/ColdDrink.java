package com.motiveko.designpatterns.creational.builder.fastfood;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
