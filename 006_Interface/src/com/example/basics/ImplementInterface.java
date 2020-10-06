package com.example.basics;

public class ImplementInterface implements InterfaceClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ic = new ImplementInterface();
		ic.sampleMethodOne();
	}

	@Override
	public void sampleMethodOne() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}

	@Override
	public void sampleMethodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Method Two");
	}

	@Override
	public void sampleMethodThree() {
		// TODO Auto-generated method stub
		System.out.println("Method Three");
	}

}
