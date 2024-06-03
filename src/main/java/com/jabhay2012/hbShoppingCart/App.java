package com.jabhay2012.hbShoppingCart;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jabhay2012.hbShoppingCart.entity.Category;
import com.jabhay2012.hbShoppingCart.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Category.class)
    	.addAnnotatedClass(Product.class)
    	.buildSessionFactory();
    	
    //new CreateCategory(sessionFactory);
    //new ReadCategories(sessionFactory);	
    //new CreateProducts(sessionFactory);
    new ReadProducts(sessionFactory);
    }
}
