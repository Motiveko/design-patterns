package com.motiveko.designpatterns.creational.prototype.cats;

public class Age {

	private int birth;
	private int old;
	
	public Age(int birth, int old) {
		this.birth = birth;
		this.old = old;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	

}
