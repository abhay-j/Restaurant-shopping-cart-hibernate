package com.jabhay2012.hbShoppingCart;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jabhay2012.hbShoppingCart.entity.Category;
import com.jabhay2012.hbShoppingCart.entity.Product;

public class CreateProducts {
private SessionFactory sessionFactory;
    
    public CreateProducts(SessionFactory sessionFactory) {
    	this.sessionFactory = sessionFactory;
    	//create a session object 
    	Session session = sessionFactory.getCurrentSession();
    	//begin transaction 
    	session.beginTransaction();
    	// category ids 
    	int catId1 = 1; //combos
    	int catId2 = 2; //sides
    	int catId3 = 3; //drinks
    	int catId4 = 4; //desserts
    	Category combos = session.get(Category.class, catId1);
    	Category sides = session.get(Category.class, catId2);
    	Category drinks = session.get(Category.class, catId3);
    	Category desserts = session.get(Category.class, catId4);
    	//int itemId, String title, String description, double price, Category category
    	Product product1 = new Product("chicken sadwhich combo", "combination of chicken sadwhich and fries",11.99, combos);
    	Product product2 = new Product("chicken wings combo", "combination of chicken wings and fries",11.99, combos);
    	Product product3 = new Product("Fries", "fries",4.99, sides);
    	Product product4 = new Product("10 chicken wings", "fries",11.99, sides);
    	Product product5 = new Product("strawberry smoothie", "strawberry smoothie",4.99, drinks);
    	Product product6 = new Product("banana smoothie", "banana smoothie",4.99, drinks);
    	Product product7 = new Product("fried cheesecake", "fried cheesecake dessert",4.99, desserts);
    	
    	//persist the products
    	session.persist(product1);
    	session.persist(product2);
    	session.persist(product3);
    	session.persist(product4);
    	session.persist(product5);
    	session.persist(product6);
    	session.persist(product7);
    	//commit changes to db 
    	session.getTransaction().commit();
    	session.close();
    	
    }

}
