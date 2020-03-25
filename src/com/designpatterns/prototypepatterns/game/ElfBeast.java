package com.designpatterns.prototypepatterns.game;

public class ElfBeast extends Beast{
	
	private String helpType;

	
	public ElfBeast(String helpType) {
		this.helpType = helpType;
	}
	
	public ElfBeast( ElfBeast elfBeast) {
		helpType = elfBeast.helpType;
	}
	
	@Override
	public ElfBeast copy() {
		return new ElfBeast(this);
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;
		if( !super.equals(obj)) return false;
		if( getClass() != obj.getClass()) return false;
		 
		ElfBeast other = (ElfBeast) obj;
		
		if(helpType ==null) return other.helpType ==null;
		return helpType.equals(other.helpType);
	}

	@Override
	public String toString() {
		return "Elf Beast helps with " + helpType;
	}
	
	

}
