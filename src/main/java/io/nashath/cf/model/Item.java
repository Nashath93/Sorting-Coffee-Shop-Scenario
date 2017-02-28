package io.nashath.cf.model;

import java.util.Comparator;

public class Item {

	private String itemName;
	private double itemPrice;

	public Item(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public static Comparator<Item> compareItemByItemName = new Comparator<Item>() {

		public int compare(Item item1, Item item2) {

			String item1Name = item1.getItemName().toUpperCase();
			String item2Name = item2.getItemName().toUpperCase();

			return item1Name.compareTo(item2Name);

		}

	};

	public static Comparator<Item> compareItemByItemPrice = new Comparator<Item>() {

		public int compare(Item item1, Item item2) {

			double item1Price = item1.getItemPrice();
			double item2Price = item2.getItemPrice();

			return Double.compare(item1Price, item2Price);

		}

	};

}
