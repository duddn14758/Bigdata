package com.java.service;

import java.util.ArrayList;

import com.java.model.*;
public class vipService {

	static ArrayList<Customer> custList = new ArrayList<>();	//받을때
	static ArrayList<vipCustomer> vList=new ArrayList<>();		//줄때

	public static ArrayList<vipCustomer> MakeVip(ArrayList<Customer> clist,ArrayList<vipCustomer> vlist,int index){
		custList=clist;
		Customer cust = custList.get(index);
		vipCustomer vcust = new vipCustomer(cust.getName(),cust.getGender(),cust.getEmail(),cust.getBirthYear());
		vcust.setVip();
		vList.add(vcust);
		return vList;
	}
	public static ArrayList<vipCustomer> deleteVip(ArrayList<vipCustomer> list, int index){
		vList=list;
		((vipCustomer) vList.get(index)).deleteVip();
		vList.remove(index);
		return vList;
	}
}
