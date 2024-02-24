package com.prowings.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//Print List of HashMap
public class Test {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(12);
		list1.add(43);
		list1.add(11);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(1);
		
		HashMap<String, List<Integer>> hm = new HashMap<>();
		hm.put("A", list2);
		hm.put("B", list1);
		
//		System.out.println(hm);
		

		List<List<Integer>> list =  hm.values().stream().collect(Collectors.toList());
		
		System.out.println(list);
	}
}
