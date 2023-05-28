package com.prowings.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Addition
{
	
	public static void main(String[] args) 
	{
		System.out.println("Addition");
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(24);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
	}

}
