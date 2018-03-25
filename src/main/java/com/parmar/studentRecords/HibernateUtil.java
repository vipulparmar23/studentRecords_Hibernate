package com.parmar.studentRecords;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(StudentInfo.class);
			return con.buildSessionFactory();
		}catch(Throwable t) {
			System.out.println("Failed to establish connection: "+t);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
	
}
