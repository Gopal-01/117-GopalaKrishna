package com.marticus.main;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Address;
import com.marticus.dao.Phone;
import com.marticus.dao.Student_early;
import com.marticus.dao.Student_old;
import com.marticus.dao.aadhar;
import com.marticus.dao.coachingcenter;
import com.marticus.dao.person;
import com.marticus.dao.student_new;
import com.marticus.util.HibernateUtil;

public class App {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
//				Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
//				Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
//				Student student1 = new Student("Eswar", address1);
//				Student student2 = new Student("Joe", address2);
//				session.save(student1);
//				session.save(student2);
				
				
				
//				aadhar aadhar1 = new aadhar("aa123");
//				aadhar aadhar2= new aadhar("bb123");
//				person p = new person("gopal",aadhar1);
//				person p1 = new person("ram",aadhar2);
//				session.save(p1);
//				session.save(p1);
				
				
				
//				Set<Phone> phoneNumbers = new HashSet<Phone>();
//				phoneNumbers.add(new Phone("house","32354353"));
//				phoneNumbers.add(new Phone("mobile","9889343423"));
//
//				Student student = new Student("Eswar", phoneNumbers);
//				session.save(student);

				Set<coachingcenter> coachingcenter = new HashSet<coachingcenter>();
				coachingcenter.add(new coachingcenter("learning physics","physics"));
				coachingcenter.add(new coachingcenter("learning maths","maths"));
				coachingcenter.add(new coachingcenter("learning chemistry","chemistry"));
				
				student_new s = new student_new("gopal",coachingcenter);
				session.save(s);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}
 
