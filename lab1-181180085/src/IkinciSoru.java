import java.util.Scanner;
public class IkinciSoru {

	public static void main(String[] args) {
		Scanner variable=new Scanner(System.in);
		int side1,side2,side3;		
		System.out.println("please enter the first side(with digits):");
		side1=variable.nextInt();
		System.out.println("please enter the second side(with digits):");
		side2=variable.nextInt();
		System.out.println("please enter the third side(with digits):");
		side3=variable.nextInt();
		if(side1==side2 && side2==side3)
			System.out.println("It is Equilateral");
		else if(side1==side2||side2==side3||side1==side3)
			System.out.println("It is Isosceles");
		else
			System.out.println("It is Scalene");		
	}

}
