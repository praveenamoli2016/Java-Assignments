package com.wuelevate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Course {
	private List<Student> students;
	private String name;

	public List<Student> getStudents() {
		return students;
	}

	public String getName() {
		return name;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class StreamAPI11 {
	public static void main(String[] args) {
		
		List<Student> engStudent = new ArrayList<Student>();
		List<Student> mathStudent = new ArrayList<Student>();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Naveen");
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Praveen");
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Nitin");
		Student student4 = new Student();
		student4.setId(4);
		student4.setName("Rishab");
		
		engStudent.add(student4);
		engStudent.add(student3);
		
		mathStudent.add(student1);
		mathStudent.add(student2);
		
		Course course1 = new Course();
		course1.setName("Math");
		course1.setStudents(mathStudent);
		
		Course course2 = new Course();
		course2.setName("English");
		course2.setStudents(engStudent);
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		List<String> students = courses.stream()
                .flatMap(course -> course.getStudents().stream()) //Get the students of each course
                .map(student -> student.getName()) //Now that we have a stream with all the students, we extract their name
                .collect(Collectors.toList());
//		List<Integer> students = courses.stream()
//                .flatMap(course -> course.getStudents().stream()) //Get the students of each course
//                .map(student -> student.getId()) //Now that we have a stream with all the students, we extract their name
//                .collect(Collectors.toList());

		System.out.println(students);
	}
}
