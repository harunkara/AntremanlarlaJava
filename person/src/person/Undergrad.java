package person;

import java.util.Date;
import java.util.List;

public class Undergrad extends Student {
	protected boolean isinternshipcompleted;
	protected boolean isseniorprojectcompleted;
	public Undergrad(String id, String firstname, String lastname, Date yearofbirth, String phonenumber, int age,
			String email, String address, double gpa, String department, boolean standing, boolean isregistered,
			String advisor, List<Course> courses) {
		super(id, firstname, lastname, yearofbirth, phonenumber, age, email, address, gpa, department, standing, isregistered,
				advisor, courses);
		// TODO Auto-generated constructor stub
	}
	public Undergrad( boolean isinternshipcompleted,boolean isseniorprojectcompleted) {
		this.isinternshipcompleted = isinternshipcompleted;
		this.isseniorprojectcompleted = isseniorprojectcompleted;
	}
	public Undergrad() {}
	
	

}
