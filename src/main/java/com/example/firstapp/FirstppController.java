package com.example.firstapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * 	Web Application - MVC 
 *  
 *  Html/JS -> Java -> DB (3 tier architecture)
 *  
 *  HTML/JS -> Controller -> Service -> DAO -> DB
 *  
 *  Spring class- @Component
 *  				@Controller -> @RestController
 *  				@Service
 *  				@Repository
 * 
 */

@RestController
public class FirstppController {
	
	//StudentService studentService=new StudentServiceImpl();
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/hello")
	public String greet() {
		
		return "Good Morning!";
	}
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student s) {
		
		String str= studentService.addStudent(s);
		
		return str;
	}
	
	@PutMapping("/student")
	public String updateStudent(@RequestBody Student s) {
		
		String str= studentService.updateStudent(s);
		
		return str;
	}
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		
		List<Student> studentList= studentService.getStudents();
		
		return studentList;
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable String id) {
		
		String str= studentService.deleteStudent(id);
		
		return str;
	}
	
}

/*
 *  DB Operation records-> Create, Retrieve, Update, Delete  (CRUD)
 *						   POST  , GET      , PUT  , DELETE				 
 * 		
 * 	
 * 
 * 
 */

