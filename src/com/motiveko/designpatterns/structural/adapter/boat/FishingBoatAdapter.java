package com.motiveko.designpatterns.structural.adapter.boat;

public class FishingBoatAdapter implements RowingBoat{

	FishingBoat boat;
	
	public FishingBoatAdapter() {
		boat = new FishingBoat();
	}
	
	@Override
	public void row() {
		boat.sail();
	}

}
