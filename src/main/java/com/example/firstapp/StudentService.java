package com.example.firstapp;

import java.util.List;

interface StudentService {
	
	String addStudent(Student s);
	
	String updateStudent(Student s);
	
	List<Student> getStudents();
	
	String deleteStudent(String id);
	

}
