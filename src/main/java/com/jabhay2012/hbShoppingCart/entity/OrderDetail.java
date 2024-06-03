package com.jabhay2012.hbShoppingCart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetail {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long orderDetailId;
	    @Column(name="quantity")
	    private Integer qty;
	    @Column(name="price")
	    private Double price;
        
	    //order details has many orders
	    @ManyToOne
	    @JoinColumn(name = "order_id")
	    private Order order;
        
	    //one product can have many orders details
	    @ManyToOne
	    @JoinColumn(name = "item_id")
	    private Product product;
	    
	    public OrderDetail() {
	    	this.orderDetailId = null;
	    	this.qty = 0;
	    	this.price = 0.0;
	    	this.order = null;
	    	this.product = null;
	    	
	    }

		public OrderDetail(Integer qty, Double price, Order order, Product product) {
			super();
			this.qty = qty;
			this.price = price;
			this.order = order;
			this.product = product;
		}

		public Long getOrderDetailId() {
			return orderDetailId;
		}

		public void setOrderDetailId(Long orderDetailId) {
			this.orderDetailId = orderDetailId;
		}

		public Integer getQty() {
			return qty;
		}

		public void setQty(Integer qty) {
			this.qty = qty;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		@Override
		public String toString() {
			return "OrderDetail [orderDetailId=" + orderDetailId + ", qty=" + qty + ", price=" + price + ", order="
					+ order + ", product=" + product + ", getOrderDetailId()=" + getOrderDetailId() + ", getQty()="
					+ getQty() + ", getPrice()=" + getPrice() + ", getOrder()=" + getOrder() + ", getProduct()="
					+ getProduct() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	    
	    

}
