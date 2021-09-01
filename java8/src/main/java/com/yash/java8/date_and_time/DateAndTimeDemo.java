package com.yash.java8.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.*;

public class DateAndTimeDemo {

	public static void main(String[] args) 
	{
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDate.now().isLeapYear());
		
		System.out.println(LocalDateTime.now());
		System.out.println(ZoneId.of("Europe/Paris"));
		
		
		System.out.println("\nTime And Date API in Java 7..");
		Date date=new Date();
		System.out.println(date.toString());

	}

}
