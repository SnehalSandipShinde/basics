package com.prowings.demo;

public class A {
	
	public static void main(String[] args) {
		byte b = 10;
//		b = b + 1; // Compile time error
		b = (byte) (b + 1);
		System.out.println(b);
	}
	
}
