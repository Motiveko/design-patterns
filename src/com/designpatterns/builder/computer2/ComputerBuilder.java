package com.designpatterns.builder.computer2;

public class ComputerBuilder {

	Computer computer;
	
	public ComputerBuilder(){
		computer = new Computer();
	}
	
	public ComputerBuilder setCpu(String cpu) {
		computer.setCpu(cpu);
		//Chaining 하기 위해서 계속 this를 반환한다.
		return this;
	}
	public ComputerBuilder setRam(String ram) {
		computer.setRam(ram);
		return this;
	}
	public ComputerBuilder setStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}
	
	public Computer build() {
		return computer;
	}
	
}
