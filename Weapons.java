package jrpg;

public class Weapons extends Items {

	protected double dmg;
	protected double speed;

	public Weapons() {

	}

	public Weapons(int amtparam, double valparam, double dmgparam, double spdparam, String nameparam) {

		amtparam = amount;
		valparam = value;
		dmgparam = dmg;
		spdparam = speed;
		nameparam = name;

	}

	@Override
	public String toString() {
		return " Name = " + name + " Damage = " + dmg + ", Speed = " + speed + ", Amount = " + amount + ", Value = "
				+ value;
	}

}
