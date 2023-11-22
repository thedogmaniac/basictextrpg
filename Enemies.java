package jrpg;

public class Enemies extends Entities {

	public Enemies() { // SIMPLE CONSTRUCTOR

	}

	public Enemies(double hpparam, double speedparam, double dmgparam, String nameparam) { // EXTENDED CONSTRUCTOR
		hp = hpparam;
		spd = speedparam;
		dmg = dmgparam;
		name = nameparam;
	}
}
