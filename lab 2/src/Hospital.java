import java.util.Date;
import java.util.Scanner;
public class Hospital {
	String id;
	String name;
	int age;
	String email;
	String phone;
	String adress;
	String gender;
	static int birthday;
	Date admissiondate;
	Date dischargedate;
	public static String getidname(String id,String name){
		String idName=id+name;
		return idName;
		
	}
	public static int setage(int birthday){
		return 2019-birthday;
		
	}
	
	public Hospital()
	{}
	
	
	
	public Hospital(String id,String name,String email,String phone,String adress,String gender,int birthday,Date admissiondate,Date dischargedate,int age) 
	{
		this.age=age;
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.adress=adress;
		this.gender=gender;
		this.admissiondate=admissiondate;
		this.birthday=birthday;
		this.dischargedate=dischargedate;
		
	}

	public static void main(String[] args) {
		Hospital hos=new Hospital();
		Scanner scn=new Scanner(System.in);
		hos.id="11";
		hos.name="harun";
		getidname(hos.id,hos.name);
		hos.birthday=1999;
		hos.age=setage(hos.birthday);
		hos.email="harunkara@hotmail.com";
		hos.phone="05349790321";
		hos.adress="mamak";
		hos.gender="male";
		System.out.printf("idname:%s\nage:%s",getidname(hos.id,hos.name),hos.age=setage(hos.birthday));
		
		
		
		
	

	}
	
	


}
