
// First problems with battle system

//package jrpg;
//
//import java.util.Scanner;
//
//public class test_2 {
//	public static void main(String[] args) {
//
//		Characters Jim = new Characters(100, 10, 10, "Jim");
//		Enemies Goblin = new Enemies(100, 20, 20, "Goblin");
//
//		// VARIABLES
//		String plnm = Jim.getName();
//		String ennm = Goblin.getName();
//		int plhp = Jim.getHp();
//		int enhp = Goblin.getHp();
//		int plspd = Jim.getSpd();
//		int enspd = Goblin.getSpd();
//		int endmg = Goblin.getDmg();
//		int pldmg = Jim.getDmg();
//		int plhpup = Jim.setHp(setHPChar(plhp, endmg));
//		int enhpup = Goblin.setHp(setHPEnem(enhp, pldmg));
//		String plstats = Jim.Statstostring();
//		String enstats = Goblin.Statstostring();
//
//		int i = 0;
//		while (i < 6) {
//			System.out.printf(" Fight Start!%n");
//			System.out.printf(" Goblin Attacks!%n%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....");
//			System.out.printf(" You have %d HP left!%n", plhp);
//			System.out.printf(" YOUR HP: %d%n%n", plhp); // HP IS 80 --> FURTHER REDUCE HP
//			i++;
//			System.out.printf(" Goblin Attacks!%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....", Jim.setHp(setHPChar(plhp, endmg)));
//			
//			System.out.printf(" You have %d HP left!%n", plhp);
//			i++;
//			System.out.printf(" Goblin Attacks!%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....");
//			Jim.setHp(setHPChar(plhp, endmg));
//			System.out.printf(" You have %d HP left!%n", plhp);
//			i++;
//			System.out.printf(" Goblin Attacks!%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....");
//			Jim.setHp(setHPChar(plhp, endmg));
//			System.out.printf(" You have %d HP left!%n", plhp);
//			i++;
//			System.out.printf(" Goblin Attacks!%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....");
//			Jim.setHp(setHPChar(plhp, endmg));
//			System.out.printf(" You have %d HP left!%n", plhp);
//			i++;
//			System.out.printf(" Goblin Attacks!%n");
//			System.out.printf(" You lose %d HP%n", endmg);
//			System.out.printf(" UPDATING HP.....");
//			Jim.setHp(setHPChar(plhp, endmg));
//			System.out.printf(" You have %d HP left!%n", plhp);
//			i++;
//		}
//	}
//
//	public static void firstattack(int playerspeed, int enemyspeed, int enemydmg, int playerhpupdate) {
//
//		if (playerspeed <= enemyspeed) { // Decides who attacks first
//			System.out.printf(" Goblin attacks! %n");
//			System.out.printf(" You lose %d HP! %n", enemydmg);
//			System.out.printf(" You have %d HP left!%n", playerhpupdate);
//		}
//
//	}
//
//	public static int setHPChar(int oldcharhp, int enemdmg) {
//
//		int updatecharhp = oldcharhp - enemdmg;
//		return updatecharhp;
//
//	}
//
//	public static int setHPEnem(int oldenemhp, int chardmg) {
//
//		int updateenemhp = oldenemhp - chardmg;
//		return updateenemhp;
//	}
//}
