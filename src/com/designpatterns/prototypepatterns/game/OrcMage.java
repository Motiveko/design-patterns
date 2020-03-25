package com.designpatterns.prototypepatterns.game;

public class OrcMage extends Mage	{

	private String weapon;
	
	public OrcMage(String weapon) {
		this.weapon = weapon;
	}
	
	public OrcMage(OrcMage orcMage) {
		weapon = orcMage.weapon;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;
		if( !super.equals(obj)) return false;
		if( getClass() != obj.getClass()) return false;
		
		OrcMage other = (OrcMage) obj;
		
		if( weapon == null) return other.weapon ==null;
		return weapon.equals(other.weapon);
		
	}

	@Override
	public String toString() {
		return "Orcish Mage attacks with " + weapon;
	}

	@Override
	public OrcMage copy() {
		return new OrcMage(this);
	}

	
}
