package jrpg;

public class Special extends Items {

	public Special() {
	}

	public Special(int amount, double value, String name) {

		this.amount = amount;
		this.value = value;
		this.name = name;

	}

	@Override
	public String toString() {
		return " Name = " + name + " Amount = " + amount + ", Value = " + value;
	}

}
