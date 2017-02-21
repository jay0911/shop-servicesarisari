package com.sarisari.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarisari.dao.ShopDao;
import com.sarisari.model.StoreOwner;
import com.sarisari.model.User;

@RestController
public class ShopEndpoint {
	
	@Autowired
	ShopDao shopDao;

	@GetMapping("/savestore")
	public void saveStore(){
		StoreOwner s = new StoreOwner();
		s.setName("jay");
		s.setDetails("haha");
		User u = new User();
		u.setUserid(43);
		s.setUser(u);
		shopDao.saveShop(s);		
	}
	
	@GetMapping("/selectstore")
	public List<StoreOwner> selectStore(){
		StoreOwner s = new StoreOwner();
		User u = new User();
		u.setUserid(21);
		s.setUser(u);
		List<StoreOwner> l = shopDao.selectStore(s);
		return 	l;
	}
	
	
}
