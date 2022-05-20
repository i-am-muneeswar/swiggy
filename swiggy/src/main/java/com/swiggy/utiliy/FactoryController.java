package com.swiggy.utiliy;

import com.swiggy.controller.SwiggyController;
import com.swiggy.controller.SwiggyControllerInterface;

public class FactoryController {

	public static SwiggyControllerInterface createObject() {
		
		return new SwiggyController();
		
	}

}
