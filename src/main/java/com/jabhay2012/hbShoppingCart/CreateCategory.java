package com.jabhay2012.hbShoppingCart;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jabhay2012.hbShoppingCart.entity.Category;

public class CreateCategory {
    private SessionFactory sessionFactory;
    
    public CreateCategory(SessionFactory sessionFactory) {
    	this.sessionFactory = sessionFactory;
    	//create a session object 
    	Session session = sessionFactory.getCurrentSession();
    	//begin transaction 
    	session.beginTransaction();
    	Category category1 = new Category("Combos");
    	Category category2 = new Category("Sides");
    	Category category3 = new Category("Drinks");
    	Category category4 = new Category("Desserts");
    	//save the objects 
    	session.persist(category1);
    	session.persist(category2);
    	session.persist(category3);
    	session.persist(category4);
    	// save to the tables by commiting 
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
