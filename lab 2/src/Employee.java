import java.lang.System;
public class Employee {
	public static double constantbosssalary=10000, constantprogrammersalary=4000; 
	public  String name;
	public  String position;
	public  int ID;
	public  double salary;
	public  double constantvariable;

	public Employee()
	{
		
		
	}
	public static String getinformation(String name,int ID)
	{
		String gecici;
		gecici=name+" "+ID;
		return gecici;
		
	}
	public static double salariespayable(double salariespayable,double constantvariable)
	{
		double temporary;
		if(constantvariable == 1)
		{
			temporary = 10000.0*12.0;
		}
		else
			temporary = 4000.0*12.0;
		return temporary;
	
	}
	public String name()
	{
		return name;
	}
	public String position()
	{
		return position;
	}
	public int ID()
	{
		return ID;
	}
	public double salary()
	{
		return salary;
	}
	public Employee(String name, String position,int ID,double salary,double constantvariable)
	{
		this.name = name;
		this.position = position;
		this.ID = ID;
		this.salary = salary;
		this.constantvariable=constantvariable;
		
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "merve";
		emp1.position = "boss";
		emp1.ID = 19;
		emp1.constantvariable=1.0;
		emp1.salary=salariespayable(emp1.salary,emp1.constantvariable);
		toString(emp1.name,emp1.position,emp1.ID,constantbosssalary,getinformation(emp1.name(),emp1.ID()),emp1.salary);
		System.out.println("\n");
		Employee emp2 = new Employee();
		emp2.name = "harun";
		emp2.position = "programmer";
		emp2.ID = 15;
		emp2.constantvariable=5.0;
		emp2.salary=salariespayable(emp2.salary,emp2.constantvariable);
		toString(emp2.name,emp2.position,emp2.ID,constantprogrammersalary,getinformation(emp2.name(),emp2.ID()),emp2.salary);
		
		
		

	}
	
	public void salariespayable()
	{
		
	}
	public static void toString(String name,String position,int id,double maas,String gecici,double salary)
	{
		System.out.printf("name:%s position:%s id:%d salary:%f getinformation:%s salariespayable:%f	",name,position,id,maas,gecici,salary);
	}
	

	}
