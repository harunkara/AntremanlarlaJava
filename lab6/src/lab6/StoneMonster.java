package lab6;

public class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
	
	}
	public String Attack(String name) {
		return "Attack with stone!";
	}
	public String toString() {
		return "it is a "+name+"and attack as:"+Attack(name);
	}
	

}
