package com;

import java.util.Date;

public class MyAntClass {

	public static void main(String[] args) {

		System.out.println("Hey Shashank!, You Just Successfully Built The Project!");
		System.out.println(getLocalCurrentDate());
		System.out.println("End of Program");
		
	}

	private static Date getLocalCurrentDate() {
		return new Date();		
	}

}