package enumdenemesýnavicin;

public class Student {
	private int age;
	private double gpa;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}

	public void setAge(double gpa) {
		this.gpa = gpa;
	}

	public Student(int age) {
		this.age = age;
		if(age>60)
			this.gpa=Harfnotu.AA.getNumVal();
			
	}
	public String toString() {
		return age+" "+gpa;
	}



}
