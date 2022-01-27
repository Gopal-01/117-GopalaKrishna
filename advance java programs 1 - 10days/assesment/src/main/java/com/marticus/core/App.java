package com.marticus.core;
import com.marticus.aspect.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.aspect.reservationaspect;



public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");


		reservationaspect a = (reservationaspect) appContext.getBean("th");
		a.checkin();
	    a.checkout();
	

	}
}