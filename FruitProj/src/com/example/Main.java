package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange",1600);
		fl.add(s2);
		fl.add(new Fruit(103, "Grape",3000));
		fl.add(new Fruit(104, "Cherry",500));
		fl.add(new Fruit(105, "Date Palm",1300));
		fl.add(new Fruit(106, "Kiwi",4000));
		fl.add(new Fruit(107, "Persimon",5000));
		fl.add(new Fruit(108, "Melon",15000));
		fl.add(new Fruit(109, "Banana",2500));
		fl.add(new Fruit(110, "Strawberry",7700));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0;i<fl.size();i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}

}
