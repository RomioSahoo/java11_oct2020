package com.example.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find first 10 numbers which are divisible by 5
		//stream way!
		Stream.iterate(1, initialSeed -> initialSeed+1).filter(value->value%3==0).limit(10).forEach(number->System.out.println(number));
		
		System.out.println("Stream steps are broken in parallel statements being executed....");
		
		Stream<Integer> seedStream = Stream.iterate(1, initialSeed -> initialSeed + 1);
		Stream<Integer> filteredSeedStream = seedStream.filter(value->value%4==0);
		Stream<Integer> limitFilteredSeedStream = filteredSeedStream.limit(5);
		limitFilteredSeedStream.forEach(number -> System.out.println(number));

		List<String> friends = Arrays.asList("OBB", "OWIOH", "MLANN", "BNP");
		Stream<String> friendsStream = friends.stream();
		
		List<String> location = Arrays.asList("Chennai", "Bengaluru", "Bengaluru", "Jodhpur");
		Stream<String> locationStream = location.stream();
		
		Stream<String> combined = Stream.concat(friendsStream, locationStream);
		
		combined.forEach(value -> System.out.println(value));
		
		
		
		
	}

}
