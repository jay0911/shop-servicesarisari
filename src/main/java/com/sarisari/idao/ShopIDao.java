package com.sarisari.idao;

import java.util.List;

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

	@SuppressWarnings("unchecked")
	@Override
	public StoreOwner selectStore(StoreOwner store) {
		// TODO Auto-generated method stub
		String query = "from StoreOwner where userid=:userid";
		//String query = "from StoreOwner s join fetch s.user u join fetch s.product p  where u.userid=:userid";
		List<StoreOwner> storeOwnerList = customSelectQuery(query)
				.setParameter("userid", store.getUser().getUserid())
				.list();
		return storeOwnerList.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> selectProduct(Product product) {
		// TODO Auto-generated method stub
		String query = "from Product";
		return customSelectQuery(query)
				.list();
	}

}
