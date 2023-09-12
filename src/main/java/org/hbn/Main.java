package org.hbn;

import org.hbn.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

    public static void main(String[] args) {


        Employee e = new Employee("saeed", "mirzaei", "0078535174");
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
     //   Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
        ServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        //Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        //SessionFactory sessionFactory = metadata.buildSessionFactory();
        SessionFactory sessionFactory= con.buildSessionFactory(standardServiceRegistry);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
        System.out.println("this is complete add in database");
    }


}