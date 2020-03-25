package com.designpatterns.builder.computer2;

public class Computer {

	
	private String cpu;
	private String ram;
	private String storage;
	
	public Computer() {
		cpu = "default";
		ram = "default";
		storage = "default";
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "CPU : " + cpu + ", Ram : " + ram + ", Storage : "+ storage;
	}
}
