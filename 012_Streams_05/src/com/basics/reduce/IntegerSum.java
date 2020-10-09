package com.basics.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class IntegerSum {

	
	public static void main(String[] args) {
	
		 IntStream stream = IntStream.range(1, 100); 
		 // 1,2,3,4,5,6,7,8,9, 10...... 100
		 // 1 st iteration of reduce -> n1=1, n2=2
		 // 2 nd iteration of reduce -> n1=3, n2=3 
		 // 3 rd iteration of reduce -> n1=6, n2=4
		 int count=0;
		 AtomicInteger ai = new AtomicInteger();
		 int sum = stream.reduce((n1, n2)->{
			  								ai.getAndIncrement();
			 								System.out.println("Iteration " + ai + " n1="+n1+" n2="+n2 + " n1+n2="+n1+n2);
			 								return n1+n2;
			 								}).orElse(-10);
			/*
			 * if(optionalSum.isPresent()) { System.out.println("Sum: " +
			 * optionalSum.getAsInt()); }else { System.out.println("Sum: " +
			 * "Not Calculated"); }
			 */
		 
		 System.out.println(sum);
		 
		 List<Integer> numbers = Arrays.asList(55,44, 58,99, 1, 4);
		 
		 Integer min = numbers.stream().reduce((n1, n2) -> Math.min(n1, n2)).orElse(-1);
		 System.out.println(min);
		 
		 //with method reference
		 Integer max = numbers.stream().reduce(Math::max).orElse(-1);
		 System.out.println(max);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
