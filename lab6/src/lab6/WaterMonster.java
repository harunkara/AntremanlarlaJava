package lab6;

public class WaterMonster extends Monster {

	public WaterMonster(String name) {
		super(name);

	}
	public String Attack(String name) {
		return "Attack with water!";
	}
	public String toString() {
		return "it is a "+name+"and attack as:"+Attack(name);
	}
	

}
