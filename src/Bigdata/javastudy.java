package Bigdata;

public class javastudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vip isv=new vip("�λ�",15000,"������",true);
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
		System.out.println("----------������-----------");
		System.out.println("���� : " +region);
		System.out.println("���� : " +income);
		System.out.println("���� : " +job);
	}
	
}

class vip extends customer{
	boolean vc=false;
	public vip(String r,int i,String j,boolean v){
		super(r,i,j);
		vc=v;
		
	}
	public void isvip(){
		if(vc==true){
			System.out.println("vip���Դϴ�");
		}else{
			System.out.println("vip���� �ƴմϴ�");
		}
		
	}
	
	
}

