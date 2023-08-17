package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

}

/* user get appointment time and we need to detect the time duration
from user location to given location and remind them at what time user should leave
 to reach on destination to reach on set time.

  input1 = user location
  input2 = appointment location
  input3 = appointment time
  input4 = mode of transport
  output = based on present time return user's departure time.

  e.g. Suppose my current location is hsr need to reach kormangala and my appointment time is 11:00 am
  current time is now 9:30 am the time taken from hsr to kormangala is 40 min then I should leave my
  house between 10:10-10:20 to reach on time.


 	simple case :
 	input1 = appointment time
 	input2 = distance
 	input3 = speed
 	output = return time and subtract from input1.

Things to do:
	Create a controller to get input from user.
	create model based on input
	calculate departure time using model.


  */