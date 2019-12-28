import java.util.Scanner;
public class UcuncuSoru {

	public static void main(String[] args) {
		Scanner variable=new Scanner(System.in);
		int temporary=1;
		System.out.println("please enter the number to calculate factorial of number:");
		int number;
		number=variable.nextInt();
		for(int i=1;i<=number;i++) {
			temporary*=i;	
		}
		System.out.println("factorial of number:"+temporary);
	}

}
