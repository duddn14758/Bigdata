package com.java.controller;

import com.java.service.ICustomerService;

public class Customercontroller {
	ICustomerService custService;
	
	public void setCustomerService(ICustomerService custService){
		this.custService=custService;
	}
	public void run(String name){
		System.out.println("Controller");
	}

}
