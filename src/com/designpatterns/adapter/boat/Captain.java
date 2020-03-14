package com.designpatterns.adapter.boat;

public class Captain {

	RowingBoat rowingBoat;
	
	public Captain() {
		
	}
	
	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	public void setBoat(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	public void row() {
		rowingBoat.row();
	}
}
