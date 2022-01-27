package com.marticus.dao;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Books;



import com.marticus.util.HibernateUtil;

public class M2MT {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

//			Set<Course> courses = new HashSet<Course>();
//			courses.add(new Course("Maths"));
//			courses.add(new Course("Computer Science"));
//
//  		Student student1 = new Student("Eswar", courses);
//			Student student2 = new Student("Joe", courses);
//			session.save(student1);
//		session.save(student2);
			Set<Books> Books = new HashSet<Books>();
			Books.add(new Books("java"));
			Books.add(new Books("python"));
			Books.add(new Books("c++"));
			
			library lib = new library("centrallibrary",Books);
			library lib2 = new library("nationallibrary",Books);
            
			session.save(lib);
			session.save(lib2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

}
}

 
