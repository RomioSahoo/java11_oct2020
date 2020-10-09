package com.java.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingMap {

	public static void main(String[] args) {
		
		List<Integer> scores = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//statements are not chained!
		Stream<Integer> scoresSquared = scores.stream().map(eachValue -> eachValue * eachValue);
		
		List<Integer> scoresSquaredList = scoresSquared.collect(Collectors.toList());
		
		System.out.println(scoresSquaredList);
		
		//chained
		
		System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(eachValue -> {
																						System.out.println("Hello from map for "+ eachValue + " Squared: " + eachValue*eachValue);
																						return eachValue*eachValue;
																						}).collect(Collectors.toList()));
		
		List<Integer> prime = Arrays.asList(1,3,5,7,13);
		List<Integer> even = Arrays.asList(2,4,6,8,10);
		List<Integer> odd = Arrays.asList(1,3,5,7,9);
		
		List<List<Integer>> listOfList = Arrays.asList(prime, even, odd);
		
		Stream<Object> streamofList = listOfList.stream().map(eachValue -> eachValue);
		System.out.println(streamofList.collect(Collectors.toList()));
		
		Stream<Object> singleStream = listOfList.stream().flatMap(eachValue -> eachValue.stream());
		System.out.println(singleStream.collect(Collectors.toList()));
		
		
		
		
		
	}
	
}
