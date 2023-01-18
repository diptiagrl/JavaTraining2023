package com.citibank.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("1. ArrayList");
		
		//Collection<String> nameList = new ArrayList<>();
		
		List<String> nameList = new ArrayList<>();
		System.out.println("Name list size :: " +nameList.size());
		System.out.println("Name list ::" + nameList);
		
		nameList.add("Dipti");
		nameList.add("Priti");
		String name = new String("Dhannya");
		nameList.add(name);
		nameList.add("Dhannya");
		System.out.println("Name list size :: " +nameList.size());
		System.out.println("Name list ::" + nameList);
		
		System.out.println("Name list at index 2:: " +nameList.get(2));
		nameList.remove("Dhannya");
		System.out.println("Size after deletion is ::" +nameList.size());
		System.out.println(nameList);
		
		System.out.println("----------------------------");
		System.out.println("2. HashSet");
		
		Set<Integer> numberSet = new HashSet<>();
		System.out.println("Hashset size ::" +numberSet.size());
		numberSet.add(101);
		numberSet.add(102);
		numberSet.add(5);
		numberSet.add(101);
		numberSet.add(103);
		numberSet.add(102);
		numberSet.add(5);
		
		System.out.println("After adding");
		System.out.println("numberset size :: " +numberSet.size());
		System.out.println("numberset :: " +numberSet);
		
		numberSet.remove(103);
		numberSet.remove(10);
		System.out.println("After removing");
		System.out.println("numberset size :: " +numberSet.size());
		System.out.println("numberset :: " +numberSet);
		
		System.out.println("----------------------------");
		System.out.println("3. TreeSet");
		Set<String> nameTreeSet = new TreeSet<>();
		System.out.println("TreeSet size is ::" + nameTreeSet.size());
		System.out.println("Treeset :: " + nameTreeSet);
		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("C");
		nameTreeSet.add("Z");
		nameTreeSet.add("B");
		nameTreeSet.add("T");
		nameTreeSet.add("c");
		nameTreeSet.add("i");
		nameTreeSet.add("1");
	//	nameTreeSet.add(null);
		
		System.out.println("After adding");
		System.out.println("Treeset size is :: " + nameTreeSet.size());
		System.out.println("treeset :: " +nameTreeSet);
		
		nameTreeSet.remove("B");
		System.out.println("After removing");
		System.out.println("Treeset size is :: " + nameTreeSet.size());
		System.out.println("treeset :: " +nameTreeSet);
		
		System.out.println("Main End");

	}

}
