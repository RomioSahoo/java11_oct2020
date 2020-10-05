package com.example.main;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechnologyStack stack = new TechnologyStack();
		System.out.println(stack.framework);
		System.out.println(stack.layer);
		stack.describe();
		stack.getVersion();
		
		Technology tech1 = new Technology();
		tech1.describe();
		
		
		Technology tech2 = new TechnologyStack();
		tech2.describe();
	}

}
