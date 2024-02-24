package com.prowings.demo;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello");
//		m1();//StachOverFlowError
	}
	
	public static void m1()
	{
		m2();
	}

	private static void m2() {
		m1();
		
	}

}
