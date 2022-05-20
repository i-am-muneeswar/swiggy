package com.swiggy.utiliy;

import com.swiggy.dao.SwiggyDAO;
import com.swiggy.dao.SwiggyDAOInterface;

public class FactoryDAO {

	public static SwiggyDAOInterface createObject() {
		
		
		return new SwiggyDAO();
		
	}

}
