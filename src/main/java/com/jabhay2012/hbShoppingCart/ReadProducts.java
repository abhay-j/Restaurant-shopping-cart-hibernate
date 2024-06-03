package com.jabhay2012.hbShoppingCart;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jabhay2012.hbShoppingCart.entity.Product;

public class ReadProducts {
	private SessionFactory sessionFactory;
	public ReadProducts(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		//create session object 
		
		Session session = sessionFactory.getCurrentSession();
		
		// being transaction
		session.beginTransaction();
		
		List<Product> products = session.createQuery("from Product").getResultList();
		
		for(Product product: products) {
			System.out.println(product.getTitle());
		}
		session.getTransaction().commit();
		session.close();
		
	}

}
