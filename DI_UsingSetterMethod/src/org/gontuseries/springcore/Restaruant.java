package org.gontuseries.springcore;

public class Restaruant {

	IHotDrink hotDrink;
	
	public void setHotDrink(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
	
}