package person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {
	protected double gpa;
	protected String department;
	protected boolean standing;
	protected boolean isregistered = false;
	protected String advisor;
	private List<Course> courses;

	public Student(String id, String firstname, String lastname, Date yearofbirth, String phonenumber, int age,
			String email, String address, double gpa, String department, boolean standing, boolean isregistered,
			String advisor, List<Course> courses) {
		super(id, firstname, lastname, yearofbirth, phonenumber, age, email, address);
		this.gpa = gpa;
		this.department = department;
		this.standing = standing;
		this.isregistered = isregistered;
		this.advisor = advisor;
		this.courses = courses;
	}

	public Student() {
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isStanding() {
		return standing;
	}

	public void setStanding(boolean standing) {
		this.standing = standing;
	}

	public boolean isIsregistered() {
		return isregistered;
	}

	public void setIsregistered(boolean isregistered) {
		this.isregistered = isregistered;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Course> getCourses() {

		return courses;
	}

	public boolean checkStanding() {
		if (gpa > 2.0 && isregistered == true)
			return true;
		else
			return false;
	}

	public String toString() {
		return super.toString() + this.courses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date firstDate1 = new Date(2000, 12, 11);

		Course krs1 = new Course("sf", "saf", "s34a", 3.0, "dsf", "f", "sder");
		Course math = new Course("sf", "sahgjf", "sa", 3.0, "dsf", "f", "sder");
		List<Course> kurslarlistesi = new ArrayList<Course>();
		kurslarlistesi.add(krs1);
		kurslarlistesi.add(math);
		Student std1 = new Student("9952", "harun", "kara", firstDate1, "das", 3, "af", "dfwef", 7.8, "ege", true, true,
				"efrwr", kurslarlistesi);
		std1.courses.add(math);
		System.out.println(std1);

	}

}
