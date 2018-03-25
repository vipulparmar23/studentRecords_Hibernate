package com.parmar.studentRecords;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session = HibernateUtil.getSessionFactory().openSession();
       
       session.beginTransaction();
       StudentInfo first = new StudentInfo("Vipul", "Parmar", "Ahmedabad", "India");
       session.save(first);
       session.getTransaction().commit();
       
    }
}
