package com.jabhay2012.hbShoppingCart.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="order")
public class Order {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="order_id")
 private long orederId;
 @Column(name="order_date", nullable=false, length=30)
 private String orederDate;
 @Column(name="order_status", nullable=false, length=30)
 private String status;
 @Column(name="total_amount")
 private Double totalAmount;
 
 // has many to one relationship with user

 @ManyToOne
 @JoinColumn(name = "user_id")
 private User user;
 //has one to many relationship with order details 
 @OneToMany(mappedBy = "order")
 private List<OrderDetail> orderDetails;
 
 public Order() {
	 this.orederId = 0;
	 this.orderDetails = null;
	 this.orederDate = null;
	 this.totalAmount = 0.0;
	 this.orderDetails = null;
	 
 }

public Order(String orederDate, String status, Double totalAmount, User user, List<OrderDetail> orderDetails) {
	super();
	this.orederDate = orederDate;
	this.status = status;
	this.totalAmount = totalAmount;
	this.user = user;
	this.orderDetails = orderDetails;
}

public long getOrederId() {
	return orederId;
}

public void setOrederId(long orederId) {
	this.orederId = orederId;
}

public String getOrederDate() {
	return orederDate;
}

public void setOrederDate(String orederDate) {
	this.orederDate = orederDate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public Double getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(Double totalAmount) {
	this.totalAmount = totalAmount;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public List<OrderDetail> getOrderDetails() {
	return orderDetails;
}

public void setOrderDetails(List<OrderDetail> orderDetails) {
	this.orderDetails = orderDetails;
}

@Override
public String toString() {
	return "Order [orederId=" + orederId + ", orederDate=" + orederDate + ", status=" + status + ", totalAmount="
			+ totalAmount + ", user=" + user + ", orderDetails=" + orderDetails + ", getOrederId()=" + getOrederId()
			+ ", getOrederDate()=" + getOrederDate() + ", getStatus()=" + getStatus() + ", getTotalAmount()="
			+ getTotalAmount() + ", getUser()=" + getUser() + ", getOrderDetails()=" + getOrderDetails()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
 
 
 
}
