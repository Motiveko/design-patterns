package com.designpatterns.prototypepatterns.game;

public class OrcBeast extends Beast{

	private String weapon;
	
	public OrcBeast(String weapon) {
		this.weapon = weapon;
	}
	
	public OrcBeast(OrcBeast orcBeast) {
		weapon = orcBeast.weapon;
	}
	
	@Override
	public OrcBeast copy() {
		return new OrcBeast(this);
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;
		if( !super.equals(obj)) return false;
		if( getClass() != obj.getClass()) return false;
		
		OrcBeast other = (OrcBeast) obj;
		
		if( weapon == null) return other.weapon ==null;
		return weapon.equals(other.weapon);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
