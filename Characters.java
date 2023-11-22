package jrpg;

public class Characters extends Entities {

	public Characters() { // SIMPLE BUILD METHOD

	}

	public Characters(double hpparam, double dmgparam, double spdparam, double dfsparam, String nameparam) { // EXTENDED
																												// BUILD
		// METHOD

		hp = hpparam;
		dmg = dmgparam;
		spd = spdparam;
		dfs = dfsparam;
		name = nameparam;

	}
}
