package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();  
	      
		 //   Employee e1=new Employee();  
		 //   e1.setName("Gaurav Chawla");  
		      
//		    Regular_Employee e2=new Regular_Employee();  
//		    e2.setName("Vivek Kumar");  
//		    e2.setSalary(50000);  
//		    e2.setBonus(5);  
//		      
//		    Contract_Employee e3=new Contract_Employee();  
//		    e3.setName("Arjun Kumar");  
//		    e3.setPay_per_hour(1000);  
//		    e3.setContract_duration("15 hours");  
//		    
		    
		    acc_save s = new acc_save();
			 s.setId(1);
			
			 s.setName("vegeta");
			 s.setInterest(10);
			 
			 acc_current c = new acc_current();
			 
			 c.setId(1);
			 c.setName("goku");
			 c.setOdm(1200000);
			 
			 session.persist(s);  
			 session.persist(c);
		      
		   // session.persist(e1);  
		    session.persist(s);  
		    session.persist(c);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("success");  	
	}
}