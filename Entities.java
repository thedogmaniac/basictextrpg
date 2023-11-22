package jrpg;

public class Entities {
	// - ADD LVL
	// - ADD XP-System
	protected double hp; // Health Points STAT OF OBJECT
	protected double dmg; // Damage Points STAT OF OBJECT
	protected double spd; // Speed Points STAT OF OBJECT
	protected double dfs; // Defense Points STAT OF OBJECT
	protected String name; // Name OF OBJECT

	public double getHp() { // PRINTS Health Points of Enemy-Object
//		System.out.printf(" %n --------------------%n %S has %d HP left.%n --------------------%n", getName(), hp);
		return hp;
	}

	public double setHp(double hp) { // INCREASES OR DECREASES Enemy-Object Health Points
		this.hp = hp;
		return hp;
	}

	public double getSpd() { // PRINTS Speed Points of Enemy-Object
		return spd;
	}

	public void setSpd(int spd) { // INCREASES OR DECREASES Enemy-Object Speed Points
		this.spd = spd;
	}

	public void setDfs(int dfs) {
		this.dfs = dfs;
	}

	public double getDfs() {
		return dfs;
	}

	public double getDmg() { // PRINTS Damage Points of Enemy-Object
		return dmg;
	}

	public void setDmg(int dmg) { // INCREASES OR DECREASES Enemy-Object Damage Points
		this.dmg = dmg;
	}

	public String getName() { // PRINTS Name of Enemy-Object
		return name;
	}

	public void setName(String name) { // SETS Enemy-Object Name
		this.name = name;
	}

	public String SpeedtoString() { // PRINT Speed-Stats

		String speed = "";

		if (spd > 80) {
			speed = "is very quick. %n";

		}
		if (spd < 80 && spd > 60) {
			speed = "is quick. %n";
		}
		if (spd < 60 && spd > 40) {
			speed = "walks after you. %n";
		}
		if (spd < 40 && spd > 20) {
			speed = "is slow. %n";
		} else {
			speed = "a turtle would be faster.";
		}

		return speed;

	}

	public String Statstostring() { // PRINT all Stats
		return getName() + " has " + getHp() + " Points of HP, deals " + getDmg() + " Points of Damage and "
				+ SpeedtoString();
	}

}
