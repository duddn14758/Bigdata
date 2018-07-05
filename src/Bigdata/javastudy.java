package Bigdata;

import java.util.Scanner;

public class javastudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		vip isv=new vip("�λ�",15000,"������");
		isv.isvip();
		isv.makevip();
		isv.isvip();
		isv.info();		
		
		//�Է��Ұ��� �������� �˻��Ұ��� -> �������Է� -> vip���鲫�� 
	}

}

class customer{
	
	String region;
	int income;
	String job;
	public customer(String r,int i, String j){
		region=r;
		income=i;
		job=j;
	}
	public void info(){
		System.out.println("----------������-----------");
		System.out.println("���� : " +region);
		System.out.println("���� : " +income);
		System.out.println("���� : " +job);
	}
	
}

class vip extends customer{
	boolean vc=false;
	public vip(String r,int i,String j){
		super(r,i,j);
		
	}
	public void isvip(){
		if(vc==true){
			System.out.println("vip���Դϴ�");
		}else{
			System.out.println("vip���� �ƴմϴ�");
		}
		
	}
	public void makevip(){
		vc=true;
	}
	public void deletevip(){
		vc=false;
	}
	
}

