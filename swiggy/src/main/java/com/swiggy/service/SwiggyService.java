package com.swiggy.service;

import com.swiggy.dao.SwiggyDAOInterface;
import com.swiggy.entity.SwiggyUser;
import com.swiggy.utiliy.FactoryDAO;

public class SwiggyService implements SwiggyServiceInterface {

	public int createProfileService(SwiggyUser su) {
		
		SwiggyDAOInterface sd = FactoryDAO.createObject();
		int i = sd.createProfileDAO(su);
		return i;
		
	}

}
