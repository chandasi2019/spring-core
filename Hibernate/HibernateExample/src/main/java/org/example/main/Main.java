package org.example.main;

import org.example.entities.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Chandan");
        user1.setCity("Jamui");
        user1.setEmail("chandan@gmail.com");
        user1.setGender("Male");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Insert in DB
        /*
        try {
            session.save(user1);
            transaction.commit();
        } catch (Exception he) {
            System.out.println("Error occured while inserting data into table");
            transaction.rollback();
            he.printStackTrace();

        }
        */
        //2. Get from DB
        /*
        try {
            User user = session.get(User.class,1L);
            System.out.println("User ID: "+user.getId());
            //transaction.commit();
        } catch (Exception he) {
            System.out.println("Error occured while inserting data into table");
            transaction.rollback();
            he.printStackTrace();

        }
         */
        //3. Update in DB
        /*
        try {
            User user = session.get(User.class,1L);
            user.setCity("Delhi");
            session.update(user);
            transaction.commit();
        } catch (Exception he) {
            System.out.println("Error occured while inserting data into table");
            //transaction.rollback();
            he.printStackTrace();

        }
        */
        try {
            User us=new User();
            us.setId(1L);
            session.delete(us);
            transaction.commit();
        } catch (Exception he) {
            System.out.println("Error occured while deleting data into table");
            //transaction.rollback();
            he.printStackTrace();

        }
    }
}