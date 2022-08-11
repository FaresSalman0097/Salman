package co.classesinjava;

import co.collections.A5TestClassAccessModifiers;

public class A4MainClassAccessModifiers {
	
	A4MainClassAccessModifiers(){
		System.out.println("This is the main class");
	}
	
	public void methodOne() {
		System.out.println("this is the method one");
	}

	public static void main(String[] args) {
		A4MainClassAccessModifiers obj_1 = new A4MainClassAccessModifiers();
		A5SubClassAccessModifiers obj_2 = new A5SubClassAccessModifiers();
//		A5TestClassAccessModifiers obj_3 = new A5TestClassAccessModifiers(); 
		A5TestClassAccessModifiers obj_3 = new A5TestClassAccessModifiers();
		obj_1.methodOne();
		obj_2.methodTwo();
		obj_3.testMethod();

	}

}
