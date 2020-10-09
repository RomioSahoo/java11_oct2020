package com.basic.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeSamples {

	public static void main(String[] args) {
		
		//yyyy-mm-dd
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);
		
		//custom date
		LocalDate customDate = LocalDate.of(2020, Month.OCTOBER, 4);
		System.out.println("Custom Date: " + customDate);
		
		LocalDate dayOfYear1 = LocalDate.ofYearDay(2020, 366);
		System.out.println("365th day of 2020: " + dayOfYear1);
		
		LocalDate dayOfYear2 = LocalDate.ofYearDay(2020, 222);
		System.out.println("222nd day of 2020: " + dayOfYear2);
		
		//current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time: " + currentTime);

		//custom time
		LocalTime customTime = LocalTime.of(14,15,16);
		System.out.println("Custom Time: " + customTime);
		
		//time at n seconds passed for the respective day
		LocalTime timeAtSeconds = LocalTime.ofSecondOfDay(44444);
		System.out.println("Time at 44444 seconds: " + timeAtSeconds);
		
		//combination of date and time
		LocalDateTime datetimeToday = LocalDateTime.now();
		System.out.println("DateTime now: " + datetimeToday);
		
		//custom localdatetime
		LocalDateTime customDateTime = LocalDateTime.of(LocalDate.of(2020, Month.OCTOBER, 10), LocalTime.of(14, 15,16));
		System.out.println("Custom DateTime: " + customDateTime);
		
		Instant time = Instant.now();
		System.out.println("Instant Time: " + time);
		
		//using period to calculate difference
		LocalDate dob = LocalDate.of(1981,8, 31);
		LocalDate now = LocalDate.now();
		Period difference = Period.between(now, dob);
		System.out.println("Diff: " + difference);
		
		//getting diff in days, mins, hours using Duration class
		LocalDateTime dob1 = LocalDateTime.of(dob, LocalTime.of(13, 45));
		LocalDateTime now1 = LocalDateTime.now();
		
		long ageDays = Duration.between(dob1, now1).toDays();
		System.out.println("Age in Days: " + ageDays);
		long ageSeconds = Duration.between(dob1, now1).toSeconds();
		System.out.println("Age in Seconds: " + ageSeconds);
		long ageHours = Duration.between(dob1, now1).toHours();
		System.out.println("Age in Hours: " + ageHours);
		
		
		
		

		
	}
	
}
