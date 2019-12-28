package hazýrlýk;
import java.util.Scanner;
import java.util.Random;
public class yeni {
   static public void deneme(int sayý) {
		int y=sayý;
		System.out.println(y);
		
	}


	static final String deneme2="merhaba";
	static int sayý=5;
	static private  String name="hasan";
	


	public String getName() {
		return name;
	}



	 public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//yeni2 yn=new yeni2();
		//yn.deneme="selam";
		/*System.out.println(name);
		System.out.println(sayý);
		sayý++;
		System.out.println(sayý);
		System.out.println("\r\rselams\r ram\\");

	
		yeni yeniname=new yeni();
		yeniname.name="saf";
		System.out.println(yeniname.name);
		yeni.deneme(sayý);
		yeni2.denemez(56);
	
	*/
		Random rnd=new Random();
		int sayý;//=1+rnd.nextInt(47);
		sayý=5 + (int)(Math.random() * ((10 - 5) + 1));
		System.out.println(sayý);
		int rakam=9;
		rakam=(rakam==8)?rakam:12;
		System.out.println(rakam);
		rakam-=9;
		System.out.println(rakam);

		System.out.println(name);

		
		
		

	}
	private static void toString(String format) {
		// TODO Auto-generated method stub
		
	}

}

