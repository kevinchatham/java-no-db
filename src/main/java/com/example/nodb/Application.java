package com.example.nodb;

public class Application {
	public static void main(String[] args) {
		// consumption
		for (Item item : Database.ITEMS_TABLE) {
			System.out.println("Id: " + item.id);
			System.out.println("Name: " + item.name);
		}
	}
}
