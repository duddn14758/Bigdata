package Bigdata;

import java.util.Scanner;
import java.util.ArrayList;


public class insert extends CustomerManager3{
	public static ArrayList<Customer> add(ArrayList<Customer> arr) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("정화번호(YYYY) : ");
		int birthYear = scan.nextInt();
		
		
		Customer cust = new Customer(name, gender, email, birthYear);
		arr.add(cust);
		return arr;
	}		
}

class vipCustomer extends Customer{
	boolean isvip=false;
	public vipCustomer(String n, char g, String e, int b){
		super(n,g,e,b);
	}
	public void setVip(){
		System.out.println("vip등록되셧습니다");
		isvip=true;
	}
	public void deleteVip(){
		System.out.println("vip탈퇴되셨습니다");
		isvip=false;
	}
	
}
