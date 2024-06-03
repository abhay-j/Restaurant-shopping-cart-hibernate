package com.jabhay2012.hbShoppingCart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//has many to one relationship with Products
@Entity
@Table(name="menu_items")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;
	@Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;
    
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    
    public Product() {
    	this.itemId = 0;
    	this.title  = null;
    	this.description = null;
    	this.price = 0;
    }

	public Product( String title, String description, double price, Category category) {
		super();
		
		this.title = title;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", getItemId()=" + getItemId() + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice() + ", getCategory()="
				+ getCategory() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
  
	

}
