package Bigdata;

public class javastudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vip isv=new vip("부산",15000,"선생님");
		isv.isvip();
		isv.makevip();
		isv.isvip();
		isv.info();
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
		System.out.println("----------고객정보-----------");
		System.out.println("지역 : " +region);
		System.out.println("수입 : " +income);
		System.out.println("직업 : " +job);
	}
	
}

class vip extends customer{
	boolean vc=false;
	public vip(String r,int i,String j){
		super(r,i,j);
		
	}
	public void isvip(){
		if(vc==true){
			System.out.println("vip고객입니다");
		}else{
			System.out.println("vip고객이 아닙니다");
		}
		
	}
	public void makevip(){
		vc=true;
	}
	public void deletevip(){
		vc=false;
	}
	
}

