package com.sarisari.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productid;
	
	@Column(name = "productname")
	private String productname;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "productimagepath")
	private String productimagepath;
	
	@Column(name = "productprice")
	private double productprice;
	
    @ManyToOne
    @JoinColumn(name = "storeid")
	private StoreOwner storeOwner;
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tbl_orderlines",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "transactionid")
    )
	private Set<Transaction> transaction;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getProductimagepath() {
		return productimagepath;
	}
	public void setProductimagepath(String productimagepath) {
		this.productimagepath = productimagepath;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner = storeOwner;
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	
}
