package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentMain s = new StudentMain();
		s.save();
		
	}
	
	public void save(){
	    Student student = new Student();
	    student.setId(6);
	    student.setName("Sheela");
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();   
	    session.beginTransaction();
	    session.save(student);
	    session.getTransaction().commit();
	}    
	    
}
