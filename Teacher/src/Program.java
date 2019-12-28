import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter your teacher's name:");
		String name=scn.nextLine();
		System.out.println(name.trim());
		theBestTeacherOfTheWorld(name.trim());
		

	}
	public static void theBestTeacherOfTheWorld(String name){
		String name2="Georgia Margariti";
		if(name==name2) {
			System.out.println( "Happy Teacher's day the best teacher of the world");
		}
			
		/*else {
			return "(s)he is not the best teacher of the world";
		}*/
			
	
	
	
	}

}
