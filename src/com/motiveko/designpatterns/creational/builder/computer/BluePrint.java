package com.motiveko.designpatterns.creational.builder.computer;

public abstract class BluePrint {

	public abstract void setCpu();
	public abstract void setRam();
	public abstract void setStorage();
	public abstract Computer getComputer();
}
