package com.example.basic;

import java.util.stream.Stream;

public class StreamsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find first 10 numbers which are divisible by 5
		//stream way!
		Stream.iterate(1, initialSeed -> initialSeed+1).filter(value->value%3==0).limit(10).forEach(number->System.out.println(number));

	}

}
