package com.example.basic;

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

	}

}
