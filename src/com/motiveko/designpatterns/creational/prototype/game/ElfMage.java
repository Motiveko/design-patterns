package com.motiveko.designpatterns.creational.prototype.game;

public class ElfMage extends Mage {

	private String helpType;
	
	public ElfMage(String helpType) {
		this.helpType = helpType;
	}
	
	public ElfMage(ElfMage elfMage) {
		helpType = elfMage.helpType;
	}
	
	@Override
	public ElfMage copy() {
		return new ElfMage(this);
	}

	@Override
	public boolean equals(Object obj) {
		//클래스 ==으로 비교하는것은 매우 잘못됬다. 불피료한 코드
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if( getClass() != obj.getClass()) return false;
		
		ElfMage other = (ElfMage) obj;
		
		if( helpType ==null) return other.helpType==null;
		return helpType.equals(other.helpType);
	}

	@Override
	public String toString() {
		return "Elven mage helps in " + helpType;	
	}

	
}
