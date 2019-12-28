package person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {


    protected String id;
    protected String firstname;
    protected String lastname;
    protected Date yearofbirth;
    protected String phonenumber;
    protected int age;
    protected String email;
    protected String address;
    public Person(String id,String firstname, String lastname,Date yearofbirth, String phonenumber, int age, String email, String address) {
    	this.id=id;
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.yearofbirth=yearofbirth;
    	this.phonenumber=phonenumber;
    	this.age=age;
    	this.email=email;
    	this.address=address;
    	
    }
    public Person() {}
    
    
    public String getName() {
    	return firstname+" "+lastname;
    }
    
    public String getContact›nformation() {
    	return phonenumber+" "+email+" "+address;
    }
 /*   public String toString() {
    	return getName()+" "+getContact›nformation();
    }*/
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected String getFirstname() {
		return firstname;
	}
	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	protected String getLastname() {
		return lastname;
	}
	protected void setLastname(String lastname) {
		this.lastname = lastname;
	}
	protected Date getYearofbirth() {
		return yearofbirth;
	}
	protected void setYearofbirth(Date yearofbirth) {
		this.yearofbirth = yearofbirth;
	}
	protected String getPhonenumber() {
		return phonenumber;
	}
	protected void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
    
    

}
