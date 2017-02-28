package com.sarisari.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sarisari.dto.ShopMaintenanceDTO;
import com.sarisari.service.ShopService;

@RestController
public class ShopEndpoint {
	
	@Autowired
	ShopService shopService;

	@PostMapping("/savestore")
	public ShopMaintenanceDTO saveStore(@RequestBody ShopMaintenanceDTO shopMaintenanceDTO){
		return shopService.saveShop(shopMaintenanceDTO);		
	}
	
/*	@GetMapping("/selectstore")
	public List<StoreOwner> selectStore(){
		StoreOwner s = new StoreOwner();
		User u = new User();
		u.setUserid(21);
		s.setUser(u);
		List<StoreOwner> l = shopDao.selectStore(s);
		return 	l;
	}
	
	@GetMapping("/selectproduct")
	public List<Product> selectProduct(){
		StoreOwner s = new StoreOwner();
		s.setStoreid(3);
		Product p = new Product();
		p.setStoreOwner(s);
		List<Product> l = shopDao.selectProduct(p);
		return 	l;
	}*/
	
	
}
