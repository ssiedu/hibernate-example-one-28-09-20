package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
		//here we want to insert a record using hibernate.
		//Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);			//hiberanate.cfg.xml
		Configuration config=new Configuration().configure();
		//we need to create an object of SessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//we need to create an object Session
		Session session=sessionFactory.openSession();
		
		//we need to create an object of Transaction
		Transaction tr=session.beginTransaction();
		
		//create an entity object and pass it save method 
		Emp emp=new Emp(); emp.setEcode(1004); emp.setEname("MNOP"); emp.setSal(65000); 
		//Emp emp=new Emp(); emp.setEcode(1002); emp.setEname("XYZ"); emp.setSal(75000);
		session.save(emp);
		
		//we need to commit the transaction
		tr.commit();
		
		//close the session
		session.close();
		
		System.out.println("Data Stored ....");
		

	}

}
