package com.prowings.navaera_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Occurance {
	public static void main(String[] args)
	{
		String string = "Hello , welcome home Home , good afternoon";
//		String[] names = string.toLowerCase().split(" ");
		List<String> names = Arrays.asList("Abhishek", "Aditi", "Snehal", "Aditi", "aditi");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String str : names)
		{
//			System.out.println(str);
			str = str.toLowerCase();
			if (hm.containsKey(str))
				hm.put(str, hm.get(str) + 1);
			else
				hm.put(str, 1);
		}
		System.out.println(hm);
	}
}
