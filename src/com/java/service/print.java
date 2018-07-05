package com.java.service;

import java.util.ArrayList;

import com.java.model.Customer;



public class print {
	static ArrayList<Customer> custList = new ArrayList<>();

	public static void printCustomerData(ArrayList<Customer> c,int index) {
		custList=c;

		Customer cust = custList.get(index);
		System.out.println("==========CUSTOMER INFO================");
		System.out.println("이름: " + cust.getName());
		System.out.println("성별: " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("생년월일 : " + cust.getBirthYear());
		System.out.println("=======================================");
	}

}
