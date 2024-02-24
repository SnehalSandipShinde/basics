package com.prowings.navaera_interview;

public class Fibonassi {
	
	public static void main(String[] args) 
	{
		int n = 5;
		int a = 0;
		int b = 1;
		int res = 0 ;
		
		System.out.print(a+" "+b);
		
		for(int i = 0; i < n ; i++)
		{
			res = a + b ;
			a = b;
			b = res;
			System.out.print(" "+res);
		}
		System.out.print(" . . . ");
	}

}
