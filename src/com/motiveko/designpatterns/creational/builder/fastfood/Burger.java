package com.motiveko.designpatterns.creational.builder.fastfood;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
