package org.hbn;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hbn.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
            //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();


        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.buildSessionFactory();
        Session session = factory.openSession();

        Transaction t1 = session.beginTransaction();

        Employee e1 = new Employee("saeed", "alavi", "0078061210");
        session.save(e1);
        t1.commit();
        System.out.println("save success");
        factory.close();
        session.close();
    }
}
