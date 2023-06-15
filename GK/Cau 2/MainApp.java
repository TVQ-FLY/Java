package com.java.managerintern.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.java.managerintern.main.Lecturer;
import com.java.managerintern.main.Student;
import com.java.qlsv.sinhvien.ManagerStudent;

public class MainApp {
	private ArrayList<Student> listStudent;
	private ArrayList<Lecturer> lecturerList;

	public MainApp() {
		listStudent = new ArrayList<>();
		lecturerList = new ArrayList<>();
	}

	public void studentList() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number Students: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student st = new Student();
			st.inputData();
			listStudent.add(st);
			System.out.println("Add student successfuly!");

		}
	}

	public void studentListFile() throws IOException {
		String url = "F:\\content-niit\\file-content.txt";
		File file = new File(url);
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(inputStreamReader);

		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

	public void initLecturers() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number Lecturers: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Lecturer lt = new Lecturer();
			lt.inputData();
			lecturerList.add(lt);
			System.out.println("Add Lecturer successfuly!");

		}
	}

	public void displayStudents() {
		if (listStudent == null)
			System.out.println("There aren't students");
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println(listStudent.get(i).toString());
		}
	}

	public void displayLecturers() {
		if (lecturerList == null)
			System.out.println("There aren't lecturers");
		for (int i = 0; i < lecturerList.size(); i++) {
			System.out.println(lecturerList.get(i).toString());
		}
	}

	public ArrayList<Student> searchStudentByName() {
		String name;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		ArrayList<Student> listStudentByName = new ArrayList<Student>();
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getName() == name) {
				listStudentByName.add(listStudent.get(i));
			}
		}
		return listStudentByName;
	}

	public ArrayList<Student> searchMaxGrade() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> listMaxGrade = new ArrayList<Student>();
		Student max = listStudent.get(0);
		for (int i = 0; i < listStudent.size(); i++) {
			if (max.getGrade().compareTo(listStudent.get(i).getGrade()) < 0) {
				max = listStudent.get(i);
				listMaxGrade.add(max);
			}
		}
		return listMaxGrade;
	}

//	public void sortById() {
//		Comparator<Student> sortById = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				int kq = o1.getId().compareTo(o2.getId());
//				return kq;
//			}
//		};
//		listStudent.sort(sortById);
//	}

	public static void main(String[] args) {
		ManagerStudent ms = new ManagerStudent();
		System.out.println("===IN DANH SACH SINH VIEN KHOI TAO ======");
		ms.printList();
		System.out.println("===NHAP DANH SACH TU BAN PHIM ====");
		ms.inputListStudent();
		System.out.println("====IN DANH SACH NHAP TU BAN PHIM =====");
		ms.printList();
		System.out.println("===SAP XEP SINH VIEN THEO DIEM GIAM DAN =====");
		ms.sortByScoreDesc();
		ms.printList();
		System.out.println("===SAP XEP SINH VIEN THEO ID GIAM DAN =====");
		ms.sortByIDDesc();
		ms.printList();
		System.out.println("====TIM SINH VIEN CO DIEM = 9.5 ====");
		ms.printList(ms.findStudentByScore(9.5));
		System.out.println("===IN SINH VIEN LOAI GIOI =====");
		ms.printList(ms.findStudentGood());
	}
}
