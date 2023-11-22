package jrpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/***
 * 
 * 
 * 
 * 
 * @author VBBW020
 *
 */
public class charactertest {
	public static void main(String[] args) {

		// ---------------------------------------------------------------------------------
		// TO-DO:
		// ( - == not finished; ~ == in progress; + == DONE)
		// + ADD SWITCH-Case for Player_Action in Battle
		// - AUTOMATE ATTACK Choices (IF-Enemy Attacks/Defends/Flees)
		// - RANDOMISE Enemies based on Location or LVL
		// + IMPROVE Battle System (ONLY ONE BATTLE METHOD)
		// ~ Finish BATTLESYSTEM
		// + IMPLEMENT Defence System (Defend-Choice in Battle, Player takes less DMG)
		// ~ IMPLEMENT Inventory System with Java List
		// - TAKE, DISCARD or USE ITEM from Inventory
		// + OPTIMISE GAME OVER WHEN HP == 0
		// + ADD Updateable HP System for Character and Enemy
		// + EXIT BATTLESYSTEM after ENEMY == DEAD
		// ---------------------------------------------------------------------------------

		// INVENTORY - ARRAYLISTS
		// -----------------------------------------------------------------------
		List<Special> special = new ArrayList<Special>();
		List<Usables> usables = new ArrayList<Usables>();
		List<Clothing> clothes = new ArrayList<Clothing>();
		List<Weapons> weapons = new ArrayList<Weapons>();
		List<Valuables> valuables = new ArrayList<Valuables>();
		// -----------------------------------------------------------------------

		Scanner sc = new Scanner(System.in); // INIT FOR INPUT SCANNER

		// OBJECT INSTANCES
		// ------------------------------------------------------------------------------------------------------------------
		Characters fiona = new Characters(100, 10, 50, 10, "Fiona"); // PLAYER CHARACTER INIT, FIONA = TEMP NAME
		Enemies goblin = new Enemies(50, 10, 10, "Goblin"); // GOBLIN ENEMY INIT
		Enemies King = new Enemies(400, 50, 80, "King"); // KING ENEMY INIT
		Special oldkey = Inventory.getOldkey();
		Usables bigredpotion = Inventory.getBigredpotion();
		Usables smallredpotion = Inventory.getSmallredpotion();
		Clothing leatherhelmet = Inventory.getLeatherhelmet();
		Weapons ironsword = Inventory.getIronsword();
		// -------------------------------------------------------------------------------------------------------------------

		// SCENARIO-BEGIN
		System.out.printf(" You wake up in a closed room with a door, one chest and a window.");
		System.out.printf(" What do you want to do?"); // PLAYER-CHOICE START

		int i = 0; // Variable I for while-loop
		while (i < 1) { // While I < 1 Choice-Scenario Loops
			System.out.printf(" %n (D)oor %n (W)indow %n (C)hest %n (N)othing %n Your Choice: ");
			String choice = sc.nextLine();
			switch (choice.toUpperCase()) {
			case "D":
				if (!special.contains(oldkey)) { // IF PLAYER DOES NOT HAVE KEY --> DOOR DOES NOT OPEN
					System.out.printf(
							" %n You choose to walk to the door. %n The door is locked. %n You need to find the key.");

					break;
				} else {
					System.out.printf(
							" %n You walk to the door. The key in your pocket floats to the door lock and turns. %n The door opens and you walk out. %n");
					special.remove(oldkey); // Key gets used --> remove key from special inventory
					i++;
					break;

				}

			case "W": // ATMOSPHERIC
				System.out.printf(
						" %n You walk to the window. It's dark outside and you can see a small light in the distance.");
				break;
			case "C":
				System.out.printf(
						" %n You go to the chest. It's a dark oak chest. %n After opening the chest, you can see a small rusted key in the corner of the chest. %n Next to it lies a small red bottle. %n You take the key and the bottle.");
				special.add(oldkey); // Player finds key --> add key to special inventory
				usables.add(smallredpotion);
				usables.add(bigredpotion);
				System.out.printf(Inventory.toString(usables));
				break;
			case "N":
				System.out.printf("You do nothing. You die of boredom. Try Again.");
				return; // GAME OVER
			}
		}

		System.out.printf(
				" %n Outside the door is a long dark hallway, with torches along the walls, %n lighting the path you need to take. %n");
		System.out.printf(
				" %n You can hear weird noises in the distance of the hallway. You walk down the hallway, to find a Goblin at the end of it, %n protecting the only way out. %n%n%n");

		enemyattack(fiona, goblin);
		// BATTLE-START
		goblin.setSpd(5);
		battlesystem(sc, fiona, goblin, special, usables, clothes, weapons, valuables);
		goblin.setSpd(10);
	}

	// BATTLE_SYSTEM --> WIP
	public static void battlesystem(Scanner sc, Entities player, Entities enemy, List<Special> special,
			List<Usables> usables, List<Clothing> clothes, List<Weapons> weapons, List<Valuables> valuables) {

		System.out.printf(" %n%n Battle start! %n"); // Begin Battle-Scenario
//      -----------------------------------------------------------------
		// WHICH ENTITY ATTACKS FIRST
		firstattack(player, enemy);
		boolean playerfled = false;
		while ((!enemydied(enemy.hp, enemy)) || (playerfled == false)) {

			System.out.printf(" --------------- %n%n");
			System.out.printf(" %n What is your Strategy? %n");

			// Loops through battle until successfully fled, game-over or Enemy-HP == 0
			System.out.printf("");
			System.out.printf(" %n%n (A)ttack \t (D)efend %n (I)tems \t (S)tats %n (F)lee %n%n");
			String choice = sc.nextLine(); // Player can decide what he/she wants to do
			switch (choice.toUpperCase()) {
			case "A":
				while (!enemydied(enemy.getHp(), enemy) == true) { // ATTACKS STOP WHEN enemydied = true
					playerattack(player, enemy); // ADD BATTLE-END WHEN ENEMY-HP == 0
					enemyattack(player, enemy);
				}
				break;
			case "D":
				defend(player, enemy);
				break;
			case "I":
				System.out.printf(
						"Which items do you want to see? %n (C)lothing %n (S)pecial %n (U)sables %n (V)aluables %n (W)eapons %n (B)reak %n%n");
				String itemchoice = sc.nextLine();
				switch (itemchoice.toUpperCase()) { // THINK OF IT AS IN POKEMON, WHERE YOU HAVE DIFFERENT MENUS FOR
													// DIFFERENT ITEM CLASSES

				case "C":
					System.out.printf(Inventory.toString(clothes)); // PRINT CLOTHES-ARRAYLIST toString
					break;
				case "S":
					System.out.printf(Inventory.toString(special)); // PRINT SPECIAL-ARRAYLIST toString
					break;
				case "U":
					System.out.printf(Inventory.toString(usables));// PRINT USABLES-ARRAYLIST toString
					break;
				case "V":
					System.out.printf(Inventory.toString(valuables));// PRINT VALUABLES-ARRAYLIST toString
					break;
				case "W":
					System.out.printf(Inventory.toString(weapons));// PRINT WEAPONS-ARRAYLIST toString
					break;

				case "B":
					break; // STOP LOOKING AT INVENTORY
				}
//				enemyattack(player, enemy);
				break;

			case "S": // PRINT ENTITY STATS
				System.out.printf("  %s %n ", player.Statstostring());
				System.out.printf("%s %n ", enemy.Statstostring());
				break;

			case "F": // FLEE -> CURRENTLY EXITS PROGRAM
				System.out.printf(" You decide to flee! %n");
				System.out.printf(" You fled successfully! %n");
				playerfled = true;
				return;

			}
		}
	}

	public static void defend(Entities fiona, Entities goblin) {

		System.out.println(" You decide to defend!" + '\n');
		System.out.printf(" %S attacks!", goblin.getName());
		System.out.printf(" %S loses %.0f HP%n", fiona.getName(), goblin.getDmg() * ((fiona.getDfs() / 100) * 9));
		System.out.printf(" %S has %.0f HP left!%n%n", fiona.getName(),
				fiona.setHp(fiona.getHp() - (goblin.getDmg() * ((fiona.getDfs() / 100) * 9))));
		Gameover(fiona.getHp());
	}

	public static void playerattack(Entities fiona, Entities goblin) {

		if (enemydied(goblin.getHp(), goblin) == true) {
			return;
		} else {
			System.out.printf(" You decide to attack the Goblin! %n");
			System.out.printf(" %S attacks!", fiona.getName());
			System.out.printf(" %S loses %.0f HP%n", goblin.getName(), goblin.getDmg());
			System.out.printf(" %S has %.0f HP left!%n%n", goblin.getName(),
					goblin.setHp(goblin.getHp() - fiona.getDmg()));
		}
	}

	public static void enemyattack(Entities fiona, Entities goblin) {
		Gameover(fiona.getHp());
		System.out.printf(" %S attacks!", goblin.getName());
		System.out.printf(" %S loses %.0f HP%n", fiona.getName(), goblin.getDmg());
		System.out.printf(" %S has %.0f HP left!%n%n", fiona.getName(), fiona.setHp(fiona.getHp() - goblin.getDmg()));

	}

	public static void firstattack(Entities fiona, Entities goblin) {

		if (fiona.getSpd() <= goblin.getSpd()) { // Decides who attacks first
			System.out.printf(" Goblin attacks! %n");
			System.out.printf(" You lose %.0f HP! %n", fiona.getHp());
			System.out.printf(" You have %.0f HP left!%n%n", fiona.setHp(fiona.getHp() - goblin.getDmg()));
		}

	}

	public static boolean enemydied(double d, Entities goblin) {
		boolean enemydead = false;
		if (d == 0) {
			System.out.printf(" You defeated the %S %n", goblin.getName());
			enemydead = true;
			return (true);
		} else
			return false;
	}

	public static boolean Gameover(double d) { // GAME-OVER MESSAGE IF PLAYER HP <= 0
		boolean gameover = false;
		if (d == 0) {
			System.out.printf(" You died! %n Game Over!");
			gameover = true;
			System.exit(0); // Temporary GAME-END
			return (true);
		} else
			return false;
	}

}
