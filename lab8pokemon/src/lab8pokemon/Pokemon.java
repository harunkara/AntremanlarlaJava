package lab8pokemon;

public class Pokemon {
	private int id,total,hp,attack,defense,speed,generation;
	private String name,type1,type2;
	private boolean legendary;
	public Pokemon(int id, int total, int hp, int attack, int defense, int speed, int generation, String name,
			String type1, String type2, boolean legendary) {
		this.id = id;
		this.total = total;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.generation = generation;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.legendary = legendary;
	}
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public boolean isLegendary() {
		return legendary;
	}
	public void setLegendary(boolean legendary) {
		this.legendary = legendary;
	}
	public String toString() {
		return "Pokemon [id=" + id + ", total=" + total + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense
				+ ", speed=" + speed + ", generation=" + generation + ", name=" + name + ", type1=" + type1 + ", type2="
				+ type2 + ", legendary=" + legendary + "]";
	}


}
