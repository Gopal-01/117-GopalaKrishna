package com.marticus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	 
	rental com = (rental)appContext.getBean("rebmw");
	com.renting();
	
	}

}
