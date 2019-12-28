package fileislemleri;

import java.io.File;
import java.io.IOException;

public class filecreating {

	public static void main(String[] args) {
		  try {
		      File fl = new File("C:\\Users\\Computer\\Desktop\\filename2.txt");
		      if (fl.createNewFile()) {
		        System.out.println("File created: " + fl.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }


	}

}
