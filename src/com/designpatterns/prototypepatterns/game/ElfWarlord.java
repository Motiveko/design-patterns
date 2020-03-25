package com.designpatterns.prototypepatterns.game;

public class ElfWarlord extends Warlord{

	private String helpType;
	
	public ElfWarlord(String helpType) {
		this.helpType = helpType;
	}
	
	public ElfWarlord(ElfWarlord elfWarlord) {
		super(elfWarlord);
		this.helpType = elfWarlord.helpType;
	}
	
	@Override
	public ElfWarlord copy() {
		// 이것을 위해 Warlord와 elfWarlord에 같은 클래스를 input으로 받는 constructor를 만들었다!
		return new ElfWarlord(this);
	}



	@Override
	public String toString() {
		return "Elven warlord helps in " + helpType;
	}
	
		@Override
	public boolean equals(Object obj){
			if( this == obj) return true;
			if(!super.equals(obj)) return false;
			if(getClass() != obj.getClass()) return false;
			
			ElfWarlord other = (ElfWarlord) obj;
			if(helpType==null) return other.helpType ==null;
			return helpType.contentEquals(other.helpType);
	}

}
