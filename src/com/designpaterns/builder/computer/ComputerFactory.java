package com.designpaterns.builder.computer;

public class ComputerFactory {

	BluePrint bluePrint;
	
	public void generate(BluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public Computer getComputer() {
		return bluePrint.getComputer();
	}
}
