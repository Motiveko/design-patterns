package com.motiveko.designpatterns.creational.builder.computer;

public class MacBluePrint extends BluePrint {

	
	Computer computer;
	
	public MacBluePrint() {
		computer = new Computer();
		setCpu();
		setRam();
		setStorage();
	}
	@Override
	public void setCpu() {
		computer.setCpu("i9");
	}

	@Override
	public void setRam() {
		computer.setRam("16gb");
	}

	@Override
	public void setStorage() {
		computer.setStorage("1TB SSD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
