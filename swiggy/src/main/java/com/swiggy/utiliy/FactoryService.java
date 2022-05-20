package com.swiggy.utiliy;

import com.swiggy.service.SwiggyService;
import com.swiggy.service.SwiggyServiceInterface;

public class FactoryService {

	public static SwiggyServiceInterface createObject() {
		
		return new SwiggyService();
		
	}

}
