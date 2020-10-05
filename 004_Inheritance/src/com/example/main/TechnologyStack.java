package com.example.main;

public class TechnologyStack  extends Technology{

	String framework = "spring";
	
	public TechnologyStack() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("In child constructor!");
		
	}
	
	public void describe() {
		System.out.println("This is middleware framework!!!!");
	}
	
}
