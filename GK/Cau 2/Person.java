package com.java.managerintern.main;

import java.util.Scanner;

public abstract class Person {
	protected String name;
	protected String address;

	public Person() {
	}

	protected void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		name = sc.nextLine();
		System.out.println("Input address: ");
		address = sc.nextLine();
	}

	protected abstract void display();

	@Override
	public String toString() {
		return name + " - " + address;
	}

	public String getName() {
		return name;
	}
}
