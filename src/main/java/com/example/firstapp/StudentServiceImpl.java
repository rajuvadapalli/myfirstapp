package com.example.firstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student> studentList=new ArrayList<Student>();

	@Override
	public String addStudent(Student s) {
		
		studentList.add(s);
		
		return "student added";
	}

	@Override
	public String updateStudent(Student s) {
		
		for(int i=0;i<studentList.size();i++) {
			
			if(studentList.get(i).getId().equals(s.getId())) {
				studentList.get(i).setName(s.getName());
			}
		}
		return "student updated";
	}

	@Override
	public List<Student> getStudents() {
		return studentList;
	}

	@Override
	public String deleteStudent(String id) {
		
		for(int i=0;i<studentList.size();i++) {
					
					if(studentList.get(i).getId().equals(id)) {
						studentList.remove(i);
					}
				}
			return "student deleted";
		}
		
	}
