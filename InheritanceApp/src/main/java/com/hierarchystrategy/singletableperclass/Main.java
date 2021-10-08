/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hierarchystrategy.singletableperclass;

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
    
    public static void testBook() {
        System.out.println("Inserting an element database...");
        
        Book book = new Book();

        book.setDtype("Book");
        book.setTitle("The robot of dawn");
        book.setPrice(22.30);
        book.setDescription("Robots everywhere");
        book.setIsbn("0-554-456");
        book.setPublisher("2002");
        book.setNbofpage(207);
        book.setIllustrations((short)7);
        
        // Gets an entity manager and a transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.hierarchystrategy.singletableperclass_InheritanceApp_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        // Persists the book to the database
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
        
        System.out.println("Successful insertion :)");
        
        em.close();
        emf.close();
    }
        
    public static void testCD() {
    System.out.println("Inserting an element database...");
        
        CD cd = new CD();

        cd.setDtype("CD");
        cd.setTitle("Soul Train");
        cd.setPrice(23.50);
        cd.setDescription("Fantastic jazz album");
        cd.setMusiccompany("Prestige");
        cd.setNumberofcds(2);
        cd.setTotalduration(1.27);
        cd.setGender("Rock");
        
        // Gets an entity manager and a transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.hierarchystrategy.singletableperclass_InheritanceApp_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        // Persists the book to the database
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(cd);
        tx.commit();
        
        System.out.println("Successful insertion :)");
        
        em.close();
        emf.close();
    }
    
    public static void testItem() {
        System.out.println("Inserting an element database...");
        
        Item item = new Item();

        item.setDtype("Item");
        item.setTitle("Pen");
        item.setPrice(2.10);
        item.setDescription("Beautiful black pen");
        
        // Gets an entity manager and a transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.hierarchystrategy.singletableperclass_InheritanceApp_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        // Persists the book to the database
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(item);
        tx.commit();
        
        System.out.println("Successful insertion :)");
        
        em.close();
        emf.close();
    }
    
}
