package person;

import java.util.Date;
import java.util.List;

public class Phd extends Graduate{

	public Phd(String id, String firstname, String lastname, Date yearofbirth, String phonenumber, int age,
			String email, String address, double gpa, String department, boolean standing, boolean isregistered,
			String advisor, List<Course> courses) {
		super(id, firstname, lastname, yearofbirth, phonenumber, age, email, address, gpa, department, standing, isregistered,
				advisor, courses);
		// TODO Auto-generated constructor stub
	}
	protected double mastergpa,qualificationexamgrade;
	public Phd() {}
	public Phd(double mastergpa,double qualificationexamgrade) {
		this.mastergpa=mastergpa;
		this.qualificationexamgrade=qualificationexamgrade;
	}
	
	

}
