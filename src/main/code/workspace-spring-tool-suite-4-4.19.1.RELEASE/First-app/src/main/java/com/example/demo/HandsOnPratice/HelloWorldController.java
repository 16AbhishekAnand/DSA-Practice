package com.example.demo.HandsOnPratice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller // configure the file to spring boot.
@ResponseBody // converts java object to XML or JSON format.
//@RestController // combination of above two annotation.

public class HelloWorldController {
	/* Rest API we use inside the class is get,push,post,delete and these all 
	 * will return in JSON or XML format.*/
	
	//GET HTTP Method
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world") // serves as REST API.
	public String helloworld() {
		return "Hello World!";
	}
}
