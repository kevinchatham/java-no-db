package com.example.nodb;

public class Application {
	public static void main(String[] args) {
		for (Item item : Database.ITEMS) {
			System.out.println("Id: " + item.id);
			System.out.println("Name: " + item.name);
		}
	}
}
