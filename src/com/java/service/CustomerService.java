package com.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.model.*;


public class CustomerService {

	static ArrayList<Customer> custList = new ArrayList<>();
	static ArrayList<vipCustomer> vList=new ArrayList<>();


	static int index = -1;
	static int vindex=0;

	static int count = 0;// custList.size()

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {
			count = custList.size();
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, " +
					"(C)urrent, (U)pdate, (D)elete, (S)earch, (V)ip, (Q)uit");// search 기능 추가
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			menu = menu.toLowerCase();	//입력한 문자열을 모두소문자로 변환
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				insertCustomerData();
				System.out.println("고객정보를 입력했습니다.");
				break;
			case 'p' :
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'n' :
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c' :
				System.out.println("현재 데이터를 출력합니다.");
				if( (index >= 0) && (index < count)) {
					print.printCustomerData(custList, index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;			
			case 'u' :
				System.out.println("데이터를 수정합니다.");
				if( (index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					update.updateCustomerData(custList, index);
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd' :
				System.out.println("데이터를 삭제합니다.");
				if( (index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomerData(index);
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 's' :
				System.out.println("데이터를 검색합니다.");
				System.out.println("찾고자하는 정보를 입력하세요.");
				System.out.println("[1]이름, [2]성별, [3]출생년도");
				String searchdata = scan.next();
				
				switch(searchdata){
					
				case "1" : 
					String namedata = scan.next();
					searchCustomerName(namedata);
					break;
					
				case "2" :
					String FMdata = scan.next();
					searchCustomerFM(FMdata);
					break;
				
				case "3" :
					int borndata = scan.nextInt();
					searchCustomerBorn(borndata);
					
				default : 
					System.out.println("입력이 잘못되었습니다. 처음부터 다시 해주시기바랍니다.");
				}
				
				break;
			case 'v':
				System.out.println("--------vip고객관리--------");
				System.out.println("사용하고자 하는 실행을 입력하세요.");
				System.out.println("[1]vip등록, [2]vip삭제, [3]vip고객 list");
				String act = scan.next();
				System.out.println("[1]vip등록, [2]vip삭제, [3]vip고객 list");

				switch(act){
				
				case "1" : 
					if(count>0){
						vipService.MakeVip(custList, vList, index);
					}else{
						System.out.println("vip등록할 고객이 존재하지 않습니다");
					}
					break;
					
				case "2" :
					if(count>0){
						vipService.deleteVip(vList, index);
					}else{
						System.out.println("삭제할 vip고객이 존재하지 않습니다");
					}
					break;
				
				case "3" :
					if(count>0){
						viplist();
						}else{
							System.out.println("vip고객이 없습니다");
						}
					break;
					
				default : 
					System.out.println("입력이 잘못되었습니다. 처음부터 다시 해주시기바랍니다.");
				}
				break;
				
			case 'q' :
				System.out.println("프로그램을 종료합니다.");
				scan.close();	//Scanner 객체를 닫아준다.
				System.exit(0);	//프로그램을 종료시킨다.
				break;	
			default : 
				System.out.println("메뉴를 잘 못 입력했습니다.");	
			}//end switch
		}//end while
	}//end main


	public static void insertCustomerData() {
		custList=insert.add(custList);
		index++;
	}
	
	public static void viplist(){
		vipCustomer v;
		System.out.println("------vip고객 리스트------");
		for(int i=0;i<vList.size();i++){
			v=vList.get(i);
			System.out.println("이름 : "+v.getName());
		}
	}

	// 怨좉컼�뜲�씠�꽣 異쒕젰
	public static void printCustomerData(int index) {
		
		
		Customer cust = custList.get(index);
		System.out.println("==========CUSTOMER INFO================");
		System.out.println("이름: " + cust.getName());
		System.out.println("성별: " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("생년월일 : " + cust.getBirthYear());
		System.out.println("=======================================");
	}

	// index �쐞移섏쓽 怨좉컼�젙蹂대�� �궘�젣�빀�땲�떎.
	public static void deleteCustomerData(int index) {
		custList.remove(index);
	}

	public static void searchCustomerName(String searchdata) {

		for (int i = 0; i < custList.size(); i++) {
			if (custList.get(i).getName().contains(searchdata)) {
				printCustomerData(i);
			}
		}

		System.out.println("검색이 완료되었습니다.");
	}

	public static void searchCustomerFM(String searchdata) {

		char data = searchdata.charAt(0);

		for (int i = 0; i < custList.size(); i++) {
			if (custList.get(i).getGender() == data) {
				printCustomerData(i);
			}
		}

		System.out.println("검색이 완료되었습니다.");

	}

	public static void searchCustomerBorn(int searchdata) {

		for (int i = 0; i < custList.size(); i++) {
			if (custList.get(i).getBirthYear() == searchdata) {
				printCustomerData(i);
			}
		}

		System.out.println("검색이 완료되었습니다.");

	}
}

	