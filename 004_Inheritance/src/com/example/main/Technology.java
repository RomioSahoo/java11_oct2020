package com.example.main;

public class Technology {
	
	String layer = "front end!";
	
	Technology(){
		System.out.println("In parent constructor!");
	}
	
	public void describe() {
		System.out.println("This is front end technology!!!!");
	}
	
	private void version() {
		System.out.println("version 1.0.0");
	}
	
	public void getVersion() {
		this.version();
	}

}
