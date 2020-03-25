package com.designpatterns.prototypepatterns.game;

public class OrcWarlord extends Warlord{

	private String weapon;
	
	public OrcWarlord(String weapon) {
		this.weapon = weapon;
	}
	
	public OrcWarlord( OrcWarlord orcWarlord) {
		this.weapon = orcWarlord.weapon;
	}
	
	
	@Override
	public OrcWarlord copy() {
		return new OrcWarlord(this);
	}
	
	
	@Override
	public String toString() {
		return "Orcish Warlord attacks with " + weapon;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//클래스를 ==으로 비교..?
		if( this == obj	) return true;
		if(!super.equals(obj)) return false;
		if(getClass() != obj.getClass()) return false;
		
		OrcWarlord other = (OrcWarlord) obj;
		
		if( weapon ==null) return other.weapon ==null;
		
		return weapon.contentEquals(other.weapon);
	}

}
