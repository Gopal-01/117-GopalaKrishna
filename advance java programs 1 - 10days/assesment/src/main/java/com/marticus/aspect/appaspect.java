package com.marticus.aspect;
import com.marticus.core.*;

import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect

public class appaspect {


	


		@Before("execution(* com.marticus.core.reservationaspect.checkin(..))")
		public void checkid()
		{
			
			System.out.println("Id is OK");
			
		}
		@Before("execution(* com.marticus.core.reservationaspect.checkin(..))")
		public void checkvaccine()
		{
			
			System.out.println(" perfect");
			
		}
		
		@After("execution(* com.marticus.reservationaspect.checkout(..))")
		public void checkstatus() {

			System.out.println("checking room status!");
			
			System.out.println("******");

		}
}
