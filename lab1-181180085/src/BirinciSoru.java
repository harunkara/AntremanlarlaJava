import java.util.Scanner;
public class BirinciSoru {

	public static void main(String[] args) {
		Scanner variable=new Scanner(System.in);
		String name;
	    char gender;
	    int age;
	    System.out.println("please enter your name:");
	    name=variable.next();
	    System.out.println("please enter your age:");
	    age=variable.nextInt();
	    System.out.println("please enter your gender(F for female and M for male):");
	    gender=variable.next().charAt(0);
	    System.out.println("name:"+name);
	    System.out.println("age:"+age);
	    System.out.println("gender:"+gender);    
	}
}
