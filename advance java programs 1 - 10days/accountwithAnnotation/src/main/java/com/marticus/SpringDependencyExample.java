package com.marticus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class SpringDependencyExample {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(); 
		appContext.scan("com.marticus");
		appContext.refresh();
 	 
 
		saving  f = (saving) appContext.getBean("save");
		f.getCurrent();
		 
	}
}

