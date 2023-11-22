package jrpg;

public class Valuables extends Items {

	public Valuables() {
	}

	public Valuables(int amtparam, double valparam, String nameparam) {

		amtparam = amount;
		valparam = value;
		nameparam = name;

	}

	@Override
	public String toString() {
		return "Name = " + name + " Amount = " + amount + ", Value = " + value;
	}

}
