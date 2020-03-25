package com.designpatterns.prototypepatterns.game;

public abstract class Mage implements Prototype{

	public Mage() {
		
	}
	
	public Mage(Mage Source) {
		
	}
	
	@Override
	public abstract Mage copy();

	@Override
	public boolean equals(Object other) {
		//==으로 비교가 되는가? ->> 안된다
		if(this == other) return true;
		else if( other == null) return false;
		return getClass() == other.getClass();
	}

}
