package com.marticus;

public class rental{
 
	 carrent carrented;

	public carrent getCarrented() {
		return carrented;
	}

	public void setCarrented(carrent carrented) {
		this.carrented = carrented;
	}
	
	public void renting() {
		carrented.rent();
	}
	

}
