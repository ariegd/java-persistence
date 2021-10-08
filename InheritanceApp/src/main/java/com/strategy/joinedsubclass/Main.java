/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy.joinedsubclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Zodd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void testEmployee(){
        System.out.println("Inserting an element database...");        
        
        FullTimeEmp fulltime = new FullTimeEmp();
        fulltime.setName1("Sara");
        fulltime.setSalary(100000);
      
        PartTimeEmp parttime = new PartTimeEmp();
        parttime.setName1("Robert");
        parttime.setHourlyrate(60);      
        
        // Gets an entity manager and a transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.hierarchystrategy.singletableperclass_InheritanceApp_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        // Persists the book to the database
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(fulltime);
        em.persist(parttime);
        tx.commit();
        
        System.out.println("Successful insertion :)");
        
        em.close();
        emf.close();
    }
    
}
