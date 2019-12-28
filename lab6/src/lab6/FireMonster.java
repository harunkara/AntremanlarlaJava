package lab6;

public class FireMonster extends Monster  {

	public FireMonster(String name) {
		super(name);
		
	}

	public String Attack(String name) {
		return "Attack with fire!";
	}
	public String toString() {
		return "it is a "+name+"and attack as:"+Attack(name);
	}
	

}
