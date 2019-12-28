package classroomsize;

public class Student{
	String name;
	String surname;
	int midtermexam;
	int finalexam;
	double gpa;
    double average;
    public static int classroom=0;




	
	public Student(String name,String surname,int midtermexam,int finalexam) {
		this.name=name;
		this.surname=surname;
		this.midtermexam=midtermexam;
		this.finalexam=finalexam;
		this.average=(midtermexam*0.6)+(finalexam*0.4);
		this.classroom++;
		
		if(100>average&&average>90) {
			 this.gpa = harfnotu.AA.getNumVal();
		}
		else if(90>average&&average>80) {
			this.gpa = harfnotu.BA.getNumVal();
		}
		else if(80>average&&average>70) {
			this.gpa = harfnotu.BB.getNumVal();
		}
		else if(70>average&&average>60) {
			this.gpa = harfnotu.CB.getNumVal();
		}
		else if(60>average&&average>50) {
			this.gpa = harfnotu.CC.getNumVal();
		}
		else if(average<50) {
			this.gpa = harfnotu.F.getNumVal();
			}
		
	}
			

	
}
