package jrpg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory extends Items {

//	TO-DO:
//	- CREATE METHODS FOR USING ITEMS
//	- ARRAYLISTS FOR ITEMS GO IN THIS CLASS
//	- EVERYTHING RELATED TO THE INVENTORY SYSTEM GOES IN HERE
//	- EACH ITEM HAS INDEX NUMBER | PLAYER INPUTS INDEX NUMBER, ITEM GETS DESCR. PRINTED | PLAYER CAN CHOOSE TO USE IT, SELECT DIFFERENT ITEM/LIST OR EXIT THE MENU

	List<Special> special = new ArrayList<Special>();
	List<Usables> usables = new ArrayList<Usables>();
	List<Clothing> clothes = new ArrayList<Clothing>();
	List<Weapons> weapons = new ArrayList<Weapons>();
	List<Valuables> valuables = new ArrayList<Valuables>();

	static Special oldkey = new Special(1, 0, "Rusted old key");
	static Usables smallredpotion = new Usables(0, 0, 20.0, 1, 15.0, "Small Health Potion",
			"A red liquid filled in a small bottle. Smells like apple juice. \n\t Restores 20HP.");
	static Usables bigredpotion = new Usables(0, 0, 50.0, 1, 30.0, "Big Health Potion",
			"A red liquid filled in a big bottle. Smells like apple juice. \n\t Restores 50HP.");
	static Usables smallstampotion = new Usables(0, 0, 0, 1, 15.0, "Small Stamina Potion",
			"A blue liquid filled in a small bottle. Smells pretty werid. \n\t Restores 15 SP.");
	static Usables bigstampotion = new Usables(0, 0, 0, 1, 30.0, "Big Stamina Potion",
			"A blue liquid filled in a big bottle. Smells pretty werid. \n\t Restores 30 SP.");
	static Clothing leatherhelmet = new Clothing(1, 5.0, 10.0, "Leather Helmet");
	static Weapons ironsword = new Weapons(1, 15.0, 10.0, 0, "Iron Sword");

	public String printItemname() {
		return name;
	}

	public static Special getOldkey() {
		return oldkey;
	}

	public static Usables getSmallredpotion() {
		return smallredpotion;
	}

	public static Usables getBigredpotion() {
		return bigredpotion;
	}

	public static Clothing getLeatherhelmet() {
		return leatherhelmet;
	}

	public static Weapons getIronsword() {
		return ironsword;
	}

	public List<Special> getSpecial() {
		return special;
	}

	public List<Usables> getUsables() {
		return usables;
	}

	public List<Clothing> getClothes() {
		return clothes;
	}

	public List<Weapons> getWeapons() {
		return weapons;
	}

	public List<Valuables> getValuables() {
		return valuables;
	}

	public Inventory(List<Special> special, List<Usables> usables, List<Clothing> clothes, List<Weapons> weapons,
			List<Valuables> valuables) {
		super();
		this.special = special;
		this.usables = usables;
		this.clothes = clothes;
		this.weapons = weapons;
		this.valuables = valuables;
	}

	public boolean addItem(List l, Items item) { // Add Special Item to List
		return l.add(item);
	}

	public boolean removeItem(List l, Items item) { // Remove Special Item from List
		return l.remove(item);
	}

	public Items getItembyindex(int index, List l) { // Get the Special Item with Index
		if (index >= 0 && index < l.size()) {
			return (Items) l.get(index);
		} else {
			return null;
		}

	}

	public static String printItemdescr(List l, int index) {
		String space = "";
		System.out.println("\n " + l.get(index));

		return space;

	}

	public void seeInventory(List l) {
		System.out.println();
		for (int pos = 0; pos < l.size(); pos++) {
			System.out.println("\n " + pos + ". " + getName());
		}

		System.out.println();
	}

	public void selectItem(Scanner sc, Items item, List l) {
		System.out.printf(" Do you want to use the item ? %n");
		System.out.printf(" Y/N %n");
		sc.next();
		if (!sc.next().contains("Y") || !sc.next().contains("N")) {
			System.err.print("Wrong input, try again!");
		} else if (sc.next().contains("Y")) {
//			IMPLEMENT USE ITEM

//		else if (sc.next().contains("N")) {
//			
//		}

		}

	}

	public static String toString(List l) {
		return "" + l;
	}
}
