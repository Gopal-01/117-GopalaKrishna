package com.marticus.aspect;
import com.marticus.core.*;

import com.marticus.core.reservation;

public class reservationaspect implements reservation {

	@Override
	public void checkin() {
	
		System.out.println("checking in");

	}

	@Override
	public void checkout() {
		
		System.out.println("checking out");

	}

}
