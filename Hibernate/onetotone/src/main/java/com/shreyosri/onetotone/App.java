package com.shreyosri.onetotone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s =new Configuration().configure().buildSessionFactory();
        Session ses = s.openSession();
        Transaction t = ses.beginTransaction();
        Employee e= new Employee();
        e.setName("Riya");
        Employee e1= new Employee();
        e1.setName("Rima");
        Address a=new Address();
        a.setHouseno("A-101");
        a.setCity("kolkata");
        a.setState("WestBengal");
        a.setCountry("India");
        a.setPincode(743372);
        Address a1=new Address();
        a1.setHouseno("B-201");
        a1.setCity("Mumbai");
        a1.setState("Maharastra");
        a1.setCountry("India");
        a1.setPincode(123454);
        e.setAddress(a);
        e1.setAddress(a1);
        a.setEmployee(e);
        a1.setEmployee(e1);
        ses.save(e);
        ses.save(e1);
        
        t.commit();
        ses.close();
    }
}
