package com.example.myhibernate.transferobject.control;



import com.example.myhibernate.transferobject.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class hibernateMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(com.example.myhibernate.transferobject.Customer.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());


        SessionFactory sessionFactory = new Configuration().configure("com.example.myhibernate.transferobject/hibernate.cfg.xml").buildSessionFactory();
       // SessionFactory factory = configuration.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer c1 = new Customer(1,"Daniel");
        session.save(c1);
        transaction.commit();
        session.close();


    }
}
