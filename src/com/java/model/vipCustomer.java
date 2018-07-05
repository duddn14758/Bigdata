package com.java.model;

public class vipCustomer extends Customer{
	boolean isvip=false;
	String name;
	public vipCustomer(String n, char g, String e, int b){
		super(n,g,e,b);
		name=n;
	}
	public void setVip(){
		System.out.println(name+"님 vip등록되셧습니다");
		isvip=true;
	}
	public void deleteVip(){
		System.out.println(name+"님 vip탈퇴되셨습니다");
		isvip=false;
	}
	
}