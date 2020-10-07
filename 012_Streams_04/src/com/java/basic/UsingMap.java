package com.java.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingMap {

	public static void main(String[] args) {
		
		List<Integer> scores = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> scoresSquared = scores.stream().map(eachValue -> eachValue * eachValue);
		
		List<Integer> scoresSquaredList = scoresSquared.collect(Collectors.toList());
		
		System.out.println(scoresSquaredList);
		
		//chained
		
		System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(eachValue -> eachValue*eachValue).collect(Collectors.toList()));
		
	}
	
}
