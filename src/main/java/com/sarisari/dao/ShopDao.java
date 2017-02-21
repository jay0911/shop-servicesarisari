package com.sarisari.dao;

import com.sarisari.model.Product;
import com.sarisari.model.StoreOwner;

public interface ShopDao {
	public void saveShop(StoreOwner store);
	public void saveProduct(Product product);
}