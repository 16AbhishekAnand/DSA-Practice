package com.example.demo.HandsOnPratice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
	
	// http://localhost:8080/student [This URL to view in local.]
	//URL - Uniform Resource Locator.
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Abhishek","Anand");
	}

	//Restapi to return List.
	@GetMapping("/StudentList") // returning list of details.
	public List<Student> StudentList() {
		List <Student> students = new ArrayList<>();
		students.add(new Student("s1","sa"));
		students.add(new Student("s2","sb"));
		students.add(new Student("s3","sc"));
		return  students;
	}

	//PathVariable annotation allows user to give input by
	//using pathLocation format Denotion: @PathVariable

	@GetMapping("/student/{firstName}/{lastName}")
	//GetMapping and PathVariable name should be same.

	public Student studentPathVariable(@PathVariable("firstName")String firstName,
									   @PathVariable("lastName")String lastName) {
		return new Student(firstName,lastName);
	}
	//Build rest api to handle query parameter.
	/* Query parameter are at end of url and separated by ? before ? is
	* path parameter and after it is query(user's input).*/

	@GetMapping("student/query/")
	public Student studentQueryPara(@RequestParam(name = "firstName")String firstname,
									 @RequestParam(name = "lastName")String lastname) {
		return  new Student(firstname,lastname);
	}



}
