package com.java.managerintern.main;

import java.util.Scanner;

public class Student extends Person {
	private String studentId;
	private String lecId;
	private String topicTitle;
	private String grade;

	public Student() {
		super();
	}

	@Override
	public void inputData() {
		super.inputData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input id Student: ");
		studentId = sc.nextLine();
		System.out.println("Input id Lecturer: ");
		lecId = sc.nextLine();
		System.out.println("Input topic Title: ");
		topicTitle = sc.nextLine();
		System.out.println("Input grade: ");
		grade = sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Id Student: " + studentId);
		System.out.println("Topic: " + topicTitle);
		System.out.println("Grade: " + grade);

	}

	@Override
	public String getName() {
		return super.getName();
	}

	public String getGrade() {
		return grade;
	}

}
