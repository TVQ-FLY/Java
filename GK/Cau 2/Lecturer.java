package com.java.managerintern.main;

import java.util.Scanner;

public class Lecturer extends Person {
	private String lecId;

	public Lecturer() {
		super();
	}

	@Override
	public void inputData() {
		super.inputData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Iput id Lecturer: ");
		lecId = sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Id Lecturer: " + lecId);

	}

	@Override
	public String toString() {
		return super.toString() + " " + lecId;
	}

}
