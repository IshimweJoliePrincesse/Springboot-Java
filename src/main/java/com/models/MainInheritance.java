package com.models;

import com.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainInheritance {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Car c = new Car();
            c.setManufacturer("Toyota");
            c.setNumOfDoors(4);

            Bike b = new Bike();
            b.setManufacturer("Hammer");
            b.setHasCarrier(true);

            session.persist(c);
            session.persist(b);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
