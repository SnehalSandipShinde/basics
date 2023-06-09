package com.prowings.overloading;

public class FirstDemo {

	public static void m1() {
		System.out.println("method m1() calling...");
	}

	public static void m1(int i) {

		System.out.println("method m1() with param calling...");
	}

	public static void main(String[] args) {

		m1();
		m1(3);
	}

}
