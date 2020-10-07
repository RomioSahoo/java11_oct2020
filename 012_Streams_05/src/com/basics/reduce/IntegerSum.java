package com.basics.reduce;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntegerSum {

	
	public static void main(String[] args) {
	
		 IntStream stream = IntStream.range(1, 100);
		 int sum = stream.reduce((n1, n2)->n1+n2).orElse(-10);
			/*
			 * if(optionalSum.isPresent()) { System.out.println("Sum: " +
			 * optionalSum.getAsInt()); }else { System.out.println("Sum: " +
			 * "Not Calculated"); }
			 */
		 
		 System.out.println(sum);
	}
}
