package com.sarisari.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_store")
public class StoreOwner {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "storeid")
	private int storeid;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "name")
	private String name;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
	private User user;
	
    @OneToMany(mappedBy = "tbl_store", cascade = CascadeType.ALL)
	private Set<Product> product;
    
    @OneToMany(mappedBy = "tbl_store", cascade = CascadeType.ALL)
    private Set<Transaction> transaction;
	
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}

}
