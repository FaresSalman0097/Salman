package co.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int roll;
	String name;
}

public class A1ArrayList {
	public static void main(String[] args) {
		// can store any type of objects
		ArrayList list1 = new ArrayList();
		
		// can store only string objects
		ArrayList<String> list2 = new ArrayList<String>();
		Student s1 = new Student();
		s1.roll = 45;
		s1.name = "Nasrin";
		// add a data in list
		list2.add("salm");
		list2.add("eera");
		list2.add(" Ibrahim Family");
		list1.add(16092020);
		list1.add(4587);
		list1.add(10091992);
		list1.add("sohail");
		list1.add(s1);
		// list2.add(s1); // error as only string can be stored in list2
		// list2.add(1109); // error as only string can be stored in list2
		// print reference to list
		System.out.println("list1 is " + list1);
		System.out.println("list2 is " + list2);
		// get elements
		Object number = list1.get(3);
		System.out.println(number);
		System.out.println(list1.get(0));
		String name = list2.get(2); // Object keyword also can be used
		System.out.println(name);
		System.out.println(list2.get(1));
		// update element in list
		list1.set(1, "salmeera");
		System.out.println("list1 after updation " + list1);
		System.out.println("list1 after updation " + list1.get(1));
		// Remove an element
		list1.remove(2);
		System.out.println("list1 after removing index 2 " + list1);
		// clear all elements
		list1.clear();
		System.out.println(list1);
		// find an element
		if (list2.contains("eera")) { // also case sensitive Eera nu type panna else statement ku thaan poguthu
			System.out.println("sohail is in the list");
		} else {
			System.out.println("sohail is not in the list");
		}
		// Iterating using enhanced for loop
		for (String names : list2) {
			System.out.print(names);
		}
		System.out.println();
		// Iterating using for loop
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		// Iterating with Iterator
		Iterator<String> itr = list2.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			}	
	}
}