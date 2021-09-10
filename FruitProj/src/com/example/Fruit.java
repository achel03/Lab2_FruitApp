package com.example;

import java.util.Comparator;

public class Fruit {
	String name;
	int no;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruit(int i, String string, int j) {
		name = string;
		no=i;
		price=j;
	}
	public String toString() {
		return "Fruit [no="+no+", name="+name+", price="+price+"]";
	}
}
class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}
class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

