package BesantTech;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetExample {
	public static void main(String[] args) {
		HashSet obj1 = new HashSet();
		LinkedHashSet obj2 = new LinkedHashSet();
		TreeSet obj3 = new TreeSet();
		obj1.add(5);
		obj1.add("salman");
		obj1.add("salman");
		obj1.add(null);
		obj2.add(5);
		obj2.add('t');
		obj2.add('t');
		obj2.add(null);
		obj3.add(10);
		obj3.add(15);
		obj3.add(10);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);	
	}
}
