package com.motiveko.designpatterns.creational.prototype.game;

public abstract class Warlord implements Prototype{

	public Warlord() {
		
	}
	
	public Warlord(Warlord source) {
		
	}
	
	@Override
	public abstract Warlord copy();
	
	@Override
	public boolean equals(Object other) {
		if( this == other) return true;
		else if( other == null) return false;
		
		return getClass() == other.getClass();
	}
}
