package com.example.basic;

import java.util.ArrayList;

public class LambdaFunctionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Lambda expression - anonymous function which does not belong to any 
		 * class nor has any name!
		 */
		MyInterface msg = ()->{
			return "Welcome to Lambda Expression!!!!";
		};
		
		System.out.println(msg.welcome());
		
		// lambda expression with single parameter!
		/*
		 * ParameterizedFunctional pf = (value)->{ 
		 * 		return value + 10; 
		 * };
		 */
		
		ParameterizedFunctional pf = value -> value + 10;
		System.out.println(pf.incrementByTen(20));
		
		// lambda expression with multiple parameters!
		AddTwoWithLambdas al = (n1, n2)-> n1 + n2;
		
		System.out.println(al.addTwoNumbers(4, 40));
		
		System.out.println("Using lambda expression in foreach:");
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("OBB");
		friends.add("BNP");
		friends.add("CAS");
		friends.add("OWIOH");
		
		friends.forEach(friend -> System.out.println("# "+ friend + " #" ));

	}

}
