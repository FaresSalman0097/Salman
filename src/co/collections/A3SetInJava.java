package co.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A3SetInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// data is not added in indexing approach
		// hashcodes are generated for each data
		// HashSet<String> set = new HashSet<String>();
		// Data is unordered but sorted alphabetically
		TreeSet<String> set = new TreeSet<String>();
		set.add("Salman");
		set.add("sameera");
		set.add("She is my life");
		set.add("sameera");
		set.add("Sameera");
		System.out.println(set);
		// data is unique and no redundancy
		// data is not ordered
		set.remove("sameera");
		System.out.println("new set" + set);
		if (set.contains("She is my life"));
		System.out.println("it contains");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println("the size is : " + set.size());
	}
}
