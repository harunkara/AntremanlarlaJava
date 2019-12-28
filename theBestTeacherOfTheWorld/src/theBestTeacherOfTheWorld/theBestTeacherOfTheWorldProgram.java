package theBestTeacherOfTheWorld;
import java.util.Scanner;

public class theBestTeacherOfTheWorldProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter your teacher's name:");
		String name=scn.next().trim();
		System.out.println(name);
		theBestTeacherOfTheWorld(name);
		

	}
	public static void theBestTeacherOfTheWorld(String name){
		if(name=="Georgia".trim()) {
			System.out.println("Happy Teacher's day the best teacher of the world");
		}
			
		else {
			System.out.println("(s)he is not the best teacher of the world");
		}
			
	
	
	
	}
}