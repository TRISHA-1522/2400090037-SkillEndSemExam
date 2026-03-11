package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // I. Insert record using persistent object
        Movie m = new Movie(1,"RRR",new Date(),"Running","Telugu");
        session.save(m);

        tx.commit();

        // II. Update using HQL
        session = sf.openSession();
        tx = session.beginTransaction();

        String hql = "update Movie set name=?, status=? where id=?";
        Query q = session.createQuery(hql);

        q.setParameter(0,"Pushpa 2");
        q.setParameter(1,"Released");
        q.setParameter(2,1);

        int result = q.executeUpdate();

        System.out.println("Rows Updated : "+result);

        tx.commit();

        session.close();
        sf.close();
    }
}