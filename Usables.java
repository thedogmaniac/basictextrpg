package jrpg;

public class Usables extends Items {

	protected double dmg;
	protected double speed;
	protected double hp;

	public double setHp(double hp) {
		this.hp = hp;
		return hp;
	}

	public double getHp() {

		return hp;
	}

	public Usables() {

	}

	public Usables(double dmg, double speed, double hp, int amount, double value, String name, String description) {
		super();
		this.dmg = dmg;
		this.speed = speed;
		this.hp = hp;
		this.amount = amount;
		this.value = value;
		this.name = name;
		this.description = description;

	}

	@Override
	public String toString() {
		return " " + description;
	}

}
