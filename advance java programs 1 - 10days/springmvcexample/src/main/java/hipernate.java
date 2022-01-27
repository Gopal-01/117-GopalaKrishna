import org.hibernate.Session;

import com.howtodoinjava.demo.model.Student;



public class hipernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = hibernateutil.getSessionFactory().openSession();
		session.beginTransaction();
       
		Student s= new Student();

		s.setAge(id);
		s.setAge(int age);
		s.setName(name);
		
     	session.save(s);
	
		session.getTransaction().commit();
		hibernateutil.shutdown();
	}

}
