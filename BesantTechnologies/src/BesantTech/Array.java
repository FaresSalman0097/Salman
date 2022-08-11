package BesantTech;

public class Array {
	public static void main(String[] args) {
		char[] arr = new char[5];
		arr[0] = 'a';
		arr[1] = 111;
		//arr[2] = "salman";
		System.out.println(arr[0]);
		
		int[] arr1 = {1,2,6,0,5};
		
		System.out.println(arr1[3]);
		System.out.println(arr1[5]);
		
	}

}

/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
 * out of bounds for length 5 at BesantTech.Array.main(Array.java:14)
 */