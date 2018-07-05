package com.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.model.Customer;


public class update {	
	static ArrayList<Customer> custList=new ArrayList<>();
	public static void updateCustomerData(ArrayList<Customer> clist,int index) {
		custList=clist;
		Customer cust = custList.get(index);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("---------UPDATE CUSTOMER INFO----------");
		System.out.print("이름(" + cust.getName() + ") :");
		cust.setName(scan.next());

		System.out.print("성별(" + cust.getGender() + ") :");
		cust.setGender(scan.next().charAt(0));

		System.out.print("이메일(" + cust.getEmail() + ") :");
		cust.setEmail(scan.next());

		System.out.print("출생년도(" + cust.getBirthYear() + ") :");
		cust.setBirthYear(scan.nextInt());
	}

}
