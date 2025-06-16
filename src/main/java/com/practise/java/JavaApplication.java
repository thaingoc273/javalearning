package com.practise.java;

import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.practise.classes.Student;
import com.practise.service.StudentService;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		Student student = new Student("John", 90, "Computer Science");
		System.out.println(student.toString());

		List<Student> classStudents = new StudentService().createClass(10);
		for (Student std : classStudents) {
			System.out.println(std.toString());
		}
		System.out.println("\nList of students using stream:");
		classStudents.parallelStream().forEach(std->System.out.println(std.toString()));

		classStudents.sort(Comparator.comparingInt(Student::getMarks).reversed());
		System.out.println("\nSorted list of students by marks:");
		classStudents.stream().forEach(std->System.out.println(std.toString()));

		System.out.println("\nStudents who failed:");
		classStudents.stream().filter(std->std.getMarks()<50).forEach(std->System.out.println(std.toString()));

		System.out.println("\nComputer science students:");
		classStudents.stream().filter(std->std.getDepartment().equals("Computer Science")).forEach(std->System.out.println(std.toString()));

		// Map, toList, toSet, toMap, GroupingBy, Collectors,flatMap, Comparator based on multiple fields
		// https://www.geeksforgeeks.org/advance-java/multi-module-project-with-maven/
	}
}