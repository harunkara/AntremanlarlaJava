package lab7;

import java.util.Scanner;

public class denemePayment {

	public static void main(String[] args) {
		while(true) {
		int secim;
		double cash;
		String name,cardnumber,date;
		Scanner scn=new Scanner(System.in);
		System.out.println("how would u like to pay");
		System.out.println("1:cash");
		System.out.println("2:credit card");
		secim=scn.nextInt();
		switch(secim){
		case 1:{
			System.out.println("enter payment value=");
			cash=scn.nextDouble();
			Payment pm=new CashPayment(cash);
			break;
		}
		case 2:{
			System.out.println("enter payment value=");
			cash=scn.nextDouble();
			System.out.println("enter name=");
			name=scn.next();
			System.out.println("enter date of card=");
			date=scn.next();
			System.out.println("enter card number=");
			cardnumber=scn.next();
			Payment pm2=new CreditCardPayment(cash,name,date,cardnumber);

			break;
	
			
		}
		case 3:{
			break;
		}
		default:{
			System.out.println("invalid option");			
		}
		
			
		
	
			
			
		}
		}
		

	}

}
