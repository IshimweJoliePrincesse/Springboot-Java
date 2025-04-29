package com.models;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.utility.HibernateUtil;

public class StudentMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		try {
			// Create laptop first
			Laptop lap = new Laptop();
			lap.setLapDesc("Toshiba");

			// Create name details
			NameDetails names = new NameDetails();
			names.setFirstName("Uwonkunda");
			names.setMiddleName("Mahinga");
			names.setLastName("Rodin");

			// Create student and set relationships
			Student st = new Student();
			st.setNames(names);
			st.setLaptop(lap);  // This establishes the relationship

			// Persist the objects (order matters due to cascading)
			session.persist(lap);  // Persist laptop first
			session.persist(st);    // Then persist student

			tx.commit();
			System.out.println("Student and laptop saved successfully!");
			System.out.println("Student ID: " + st.getStudId());
			System.out.println("Laptop ID: " + lap.getLapId());
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}