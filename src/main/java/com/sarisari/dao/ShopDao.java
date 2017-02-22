package com.sarisari.dao;

import java.util.List;

import com.sarisari.model.Product;
import com.sarisari.model.StoreOwner;

public interface ShopDao {
	public void saveShop(StoreOwner store);
	public void saveProduct(Product product);
	public List<StoreOwner> selectStore(StoreOwner store);
	public List<Product> selectProduct(Product product);
}
