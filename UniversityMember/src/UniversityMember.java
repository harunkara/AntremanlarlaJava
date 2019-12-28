
public class UniversityMember {
	private String Id;
	private String name;
	private String surname;
	private String department;
	public String toString() {
		return "id="+Id+"name= "+name+" surname="+surname+"department= "+department;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student(14.0,12,"181180085","harun","kara","11.floor");
		System.out.println(std);
		Academician ac=new Academician(140,"palme","121180085","hasan","kuru","121.floor");
		System.out.println(ac);
		
		

	}
	public UniversityMember() {
		
	}
public UniversityMember(String Id,String name,String surname,String department){
	this.Id=Id;
	this.name=name;
	this.surname=surname;
	this.department=department;		
	}
public String getId() {
	return this.Id;
}
public String getname() {
	return this.name;
}
public String getsurname() {
	return this.surname;
}
public String department() {
	return this.department;
}




}
class Student extends UniversityMember {
	 public double GPA;
	 public int yearOfRegistration;

	 public void setGPA(double newGPA){
		    this.GPA = GPA;
		  }
	 public void setyearOfRegistration(int newyearOfRegistration) {
		    this.yearOfRegistration = yearOfRegistration;
		  }
	
	 public Student() {}
	 public Student(double GPA,int yearOfRegistration) {
		 this.GPA=GPA;
		 this.yearOfRegistration=yearOfRegistration;
	 }
	 public Student(double GPA,int yearOfRegistration,String id,String name,String surname,String department) {
		 super(id,name,surname,department);
		 this.GPA=GPA;
		 this.yearOfRegistration=yearOfRegistration;
		/* this.Id=Id;
		 this.name=name;
		 this.surname=surname;
		 this.department=department;
		*/
		 
	 }
	 
	 public double getGPA() {
		 return this.GPA;
	 }
	 public int getyearOfRegistration() {
		 return this.yearOfRegistration;
	 }
	 public String toString() {
		 return (super.toString()+" "+GPA+" "+yearOfRegistration);
	 }
}
 class Academician extends UniversityMember{
	 public int salary;
	 public String course;
	 public int getsalary() {
		 return this.salary;
	 }
	 public String getcourse() {
		 return this.course;
	 }
	 
	 public Academician() {
		 
	 }
public Academician(int salary,String course) {
	 this.salary=salary;
	 this.course=course;	 
	 }
public Academician(int salary,String course,String Id,String name,String surname,String department) {
	 super(Id,name,surname,department);
	 this.salary=salary;
	 this.course=course;
	/* this.Id=Id;
	 this.name=name;
	 this.surname=surname;
	 this.department=department;*/
}
public String toString() {
	 return (super.toString()+" salary="+salary+" course="+course);
}
	 

}
	

