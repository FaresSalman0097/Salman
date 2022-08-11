package co.collections;

public class A5TestClassAccessModifiers {
	
	public A5TestClassAccessModifiers() {
		System.out.println("This is class is accessed from main class of co.classesinjava package");

	}
	
	public void testMethod() {
		System.out.println("other package method");
	}

	public static void main(String[] args) {
		//A5TestClassAccessModifiers obj = new A5TestClassAccessModifiers();
	}
}
