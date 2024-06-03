package com.jabhay2012.hbShoppingCart.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="first_name", nullable=false, length=30)
	private String fname;
	@Column(name="last_name", nullable=false, length=30)
	private String lname;
	@Column(name="email", nullable=false, length=30)
	private String email;
	
	//a user could have multiple orders 
	
	@OneToMany(mappedBy = "user",  cascade = CascadeType.ALL)
	List<Order> orders;
	
	public User() {
		this.id = 0;
		this.fname = null;
		this.lname = null;
		this.email = null;
		this.orders = null;
	}

	public User( String fname, String lname, String email, List<Order> orders) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", orders=" + orders
				+ ", getId()=" + getId() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getEmail()="
				+ getEmail() + ", getOrders()=" + getOrders() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
