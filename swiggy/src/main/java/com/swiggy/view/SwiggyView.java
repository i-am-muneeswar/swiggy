package com.swiggy.view;

import java.util.Scanner;

import com.swiggy.controller.SwiggyControllerInterface;
import com.swiggy.utiliy.FactoryController;

public class SwiggyView {

	public static void main(String[] args) {
		
		String s = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			
			System.out.println("********** Main Menu **********");
			System.out.println("Press 1 to create Profile");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			SwiggyControllerInterface sw = FactoryController.createObject();
			
			switch(ch) {
				case 1:
					sw.createProfile();
					break;
				default:
					System.out.println("Wrong choice");
			}
			System.out.println("Press y to contine");
			s = sc.next();
		}

	}

}
