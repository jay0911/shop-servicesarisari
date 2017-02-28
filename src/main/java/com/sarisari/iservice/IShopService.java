package com.sarisari.iservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarisari.dao.ShopDao;
import com.sarisari.dto.ShopMaintenanceDTO;
import com.sarisari.model.StoreOwner;
import com.sarisari.model.User;
import com.sarisari.service.ShopService;

@Service
public class IShopService implements ShopService{

	@Autowired
	private ShopDao shopDao;
	
	@Override
	public ShopMaintenanceDTO saveShop(ShopMaintenanceDTO shopMaintenanceDTO) {
		// TODO Auto-generated method stub
		StoreOwner s = new StoreOwner();
		s.setName(shopMaintenanceDTO.getName());
		s.setDetails(shopMaintenanceDTO.getDetails());
		User u = new User();
		u.setUserid(shopMaintenanceDTO.getUserid());
		s.setUser(u);
		shopDao.saveShop(s);
		
		ShopMaintenanceDTO returndto = new ShopMaintenanceDTO();
		StoreOwner store = shopDao.selectStore(s);
		
		returndto.setShopid(store.getStoreid());
		returndto.setName(store.getName());
		return returndto;
	}

}
