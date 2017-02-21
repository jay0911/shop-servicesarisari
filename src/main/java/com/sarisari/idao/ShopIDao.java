package com.sarisari.idao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sarisari.dao.ShopDao;
import com.sarisari.model.Product;
import com.sarisari.model.StoreOwner;
import org.hibernate.Query;

@Repository
@Transactional
public class ShopIDao extends HibernateDaoSupport implements ShopDao{

	@Override
	public void saveShop(StoreOwner store) {
		// TODO Auto-generated method stub

		Query query = getSessionFactory().createSQLQuery("INSERT INTO tbl_store (userid, details,name) VALUES (:userid, :details, :name)");
		query.setParameter("userid", store.getUser().getUserid());
		query.setParameter("details", store.getDetails());
		query.setParameter("name", store.getName());
		query.executeUpdate();
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
