package org.hbn;

import org.hbn.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

    public static void main(String[] args) {
if (ncValidate.validate("006926451".trim()))
    System.out.println("your nationalCode is valid");
else
    System.out.println("your nationalCode is not valid !!!");
/*
        Employee e = new Employee("saeed", "mirzaei", "0078535174");
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
        ServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sessionFactory = con.buildSessionFactory(standardServiceRegistry);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
        System.out.println("this is complete add in database");

 */
    }


}