package fileislemleri;

import java.io.File;

public class deleteafile {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\Computer\\Desktop\\filename2.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	    
	    //delete a folder
	    /*
	    File myObj2 = new File("C:\\Users\\MyName\\Test"); 
	    if (myObj2.delete()) { 
	      System.out.println("Deleted the folder: " + myObj2.getName());
	    } else {
	      System.out.println("Failed to delete the folder.");
	    }
	    */
	    
	    
	}

}
