package com.designpaterns.builder.computer;

public class SonyBluePrint extends BluePrint{

	Computer computer;
	public SonyBluePrint() {
		computer = new Computer();
		setCpu();
		setRam();
		setStorage();
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256gb ssd");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
