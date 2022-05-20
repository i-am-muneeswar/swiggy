package com.swiggy.controller;

import java.util.Scanner;

import com.swiggy.entity.SwiggyUser;
import com.swiggy.service.SwiggyServiceInterface;
import com.swiggy.utiliy.FactoryService;

public class SwiggyController implements SwiggyControllerInterface {

	public void createProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		System.out.println("Enter Address: ");
		String address = sc.next();
		
		SwiggyUser su = new SwiggyUser();
		su.setName(name);
		su.setPassword(password);
		su.setEmail(email);
		su.setAddress(address);
		
		SwiggyServiceInterface ss = FactoryService.createObject();
		int i = ss.createProfileService(su);
		
		if(i>0) {
			System.out.println("Profile created for "+name);
		}
		
		else {
			System.out.println("Profile not created");
		}

	}

}
