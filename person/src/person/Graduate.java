package person;

import java.util.Date;
import java.util.List;

public class Graduate extends Student {
	protected double bachelorgpa;
	protected int bachelordegree;
	public Graduate(String id, String firstname, String lastname, Date yearofbirth, String phonenumber, int age,
			String email, String address, double gpa, String department, boolean standing, boolean isregistered,
			String advisor, List<Course> courses) {
		super(id, firstname, lastname, yearofbirth, phonenumber, age, email, address, gpa, department, standing, isregistered,
				advisor, courses);
		// TODO Auto-generated constructor stub
	}
	public Graduate(double bachelorgpa,int bachelordegree) { 
		this.bachelorgpa = bachelorgpa;
		this.bachelordegree = bachelordegree;
	}
	public Graduate() {}

}
