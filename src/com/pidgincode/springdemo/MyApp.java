package com.pidgincode.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create object
		Coach theCoach = new BaseballCoach();
		
		//Use object
		System.out.println(theCoach.getDailyWorkout());
		

	}

}
