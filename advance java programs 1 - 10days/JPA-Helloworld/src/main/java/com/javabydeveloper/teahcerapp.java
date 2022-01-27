package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Student;
import com.javabydeveloper.domain.teacher;

/**
 * JPA Hello world!
 *
 */
public class teahcerapp {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			teacher teacher = new teacher();
			teacher.setName("John");
			teacher.setSubjectname("physics");
			teacher.setDegreename("msc");

			entityManager.persist(teacher);

			transaction.commit();
		
			Query q = entityManager.createQuery("select t from tecr t");

			List<teacher> resultList = q.getResultList();
			System.out.println("num of teacher:" + resultList.size());
			for (teacher next : resultList) {
				System.out.println("next student: " + next);
			}

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
