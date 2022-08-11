package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Integer> list_1 = new ArrayList<>();

		list_1.add(10);
		list_1.add(20);
		list_1.add(30);
		list_1.add(40);
		System.out.println(list_1);

//		NORMAL WAY
//		List<Integer> newList = new ArrayList<>();
//		for (int i : list_1) {
//			newList.add(i * i);
//			System.out.println(newList);
//		}

		// USING STREAMS
		List<Integer> squareList = list_1.stream().map(x -> x * x).collect(Collectors.toList());
//		 map is used to change the representation of the element one by one
//		(x -> x*x) is the lambda expression
//		 collect the terminal operation - end of stream
		System.out.println("List of square numbers: " + squareList);

//		NORMAL WAY
//		Set<Integer> squareSet = new HashSet<>();
//		for(int i : list_1) {
//			squareSet.add(i*i);
//			System.out.println(squareSet);
//		}

		// USING STREAMS
		Set<Integer> squareSet = list_1.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("Set of square numbers: " + squareSet);

		List<String> languages = new ArrayList<>();
		languages.add("JAVA");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("scala");

		// NORMAL WAY

//		 List<String> filterResult = new ArrayList<>();
//		 for (String a :languages ) {
//			 if(a.startsWith("J")) {
//				 System.out.println(filterResult.add(a));
//				System.out.println("Languages starting with letter J:"+ filterResult); 
//			 }
//		 }
		
//		USING STREAMS
//		List<String> filterResult = languages.stream().filter(a -> a.startsWith("J")).collect(Collectors.toList());
//		System.out.println("Languages starting with letter J:" + filterResult);
		
//		SORTING USING STREAMS
		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		System.out.println("Printing all elements one by one");
		languages.stream().forEach(x -> {
			
		System.out.println("Element is: "+ x);
//		System.out.println("Additional statement to add curly braces"); 
//		for single line of code curly braces should be removed //
		});
	}
}
