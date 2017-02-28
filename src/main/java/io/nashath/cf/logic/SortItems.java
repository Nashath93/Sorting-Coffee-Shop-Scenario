package io.nashath.cf.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import io.nashath.cf.model.Item;

public class SortItems {

	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item("Coffee", 1.00));
		items.add(new Item("Water", 2.00));
		items.add(new Item("Milk", 1.50));
		items.add(new Item("Bagel", 1.25));
		items.add(new Item("Donut", 0.75));

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Description:\nPress N to sort items by name.\nPress P to sort items by price.\n\nEnter your letter: ");
		String inputLetter = input.next();

		if (inputLetter.equals("N") || inputLetter.equals("n")) {

			Collections.sort(items, Item.compareItemByItemName);

			System.out.println("Sort items by name");
			System.out.println("==========================================");
			System.out.println("");
			for (Item itm : items) {
				System.out.println(itm.getItemName() + " $" + itm.getItemPrice());
			}
			System.out.println("");
			input.close();

		}else if(inputLetter.equals("P") || inputLetter.equals("p")){
			
			System.out.println("Sort items by price");
			System.out.println("==========================================");
			System.out.println("");
			Collections.sort(items, Item.compareItemByItemPrice);
			for (Item item : items) {
				System.out.println(item.getItemName() + " $" + item.getItemPrice());
			}
			input.close();
		}else{
			System.out.println("Invalid input. Please see the description carefully.");
			input.close();
		}

		

	}

}
