package com.jabhay2012.hbShoppingCart;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jabhay2012.hbShoppingCart.entity.Category;

public class ReadCategories {
	private SessionFactory sessionFactory;
	public ReadCategories(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		//create session object 
		
		Session session = sessionFactory.getCurrentSession();
		
		// being transaction
		session.beginTransaction();
		
		List<Category> categories = session.createQuery("from Category").getResultList();
		
		for(Category category : categories) {
			System.out.println(category.getCategoryName() + category.getId());
		}
		session.getTransaction().commit();
		session.close();
		
	}
	
	

}
