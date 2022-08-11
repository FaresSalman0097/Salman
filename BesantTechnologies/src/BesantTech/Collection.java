package BesantTech;

import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
		Vector v  = new Vector();
		v.add(2);
		v.add('r');
		v.add("er");
		v.add(null);
		v.add('r');
		v.add(2,'y');
		v.add('c');
		System.out.println(v.get(5));
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
	}
}