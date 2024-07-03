package com.prowings.navaera_interview;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Radar";
		
		StringBuffer stb = new StringBuffer(str);
		
		stb.reverse();
		System.out.println(stb);
		
		int len = str.length();

		System.out.println(len);

		String rev = "";

		for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + str.toLowerCase().charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(str)) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}
}
