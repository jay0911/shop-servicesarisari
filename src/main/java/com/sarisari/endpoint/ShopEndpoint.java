package com.sarisari.endpoint;

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
}
