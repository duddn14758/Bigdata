package com.java.service;

import java.util.Scanner;
import java.util.ArrayList;
import com.java.model.*;


public class insert {
	public static ArrayList<Customer> add(ArrayList<Customer> arr) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("생년월일(YYYY) : ");
		int birthYear = scan.nextInt();
		
		
		Customer cust = new Customer(name, gender, email, birthYear);
		arr.add(cust);
		return arr;
	}		
}
