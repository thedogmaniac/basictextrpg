package jrpg;

public class Clothing extends Items {

	protected double defense;

	public Clothing() {

	}

	public Clothing(int amtparam, double dfsparam, double valparam, String nameparam) {

		amtparam = amount;
		dfsparam = defense;
		valparam = value;
		nameparam = name;

	}

	@Override
	public String toString() {
		return " Name = " + name + " Defense = " + defense + ", Amount = " + amount + ", Value = " + value;
	}

}
