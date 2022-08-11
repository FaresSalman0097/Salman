package co.classesinjava;

public class A3Car {

	String colourOne = "Black";
	String colourTwo = "White";

	static int tyres = 4;

	A3Car() {
		System.out.println("this is the default contructor");
		System.out.println(colourOne + " " + tyres);
	}

	A3Car(String colourTwo, int tyres) {
		System.out.println("this is the parameterised constructor");
		System.out.println(colourTwo + " " + tyres);

	}

	public void model() {
		String modelOne = "Sedan";
		String modelTwo = "Hatchback";
		System.out.println(modelOne);
	}

	public void manufacturer(String salman) {
		String one = "AUDI";
		String two = "Toyota";
		String three = "Mercedes";
		System.out.println(two);
	}

	public void year() {
		int yearOne = 2019;
		int yearTwo = 2020;
		int yearThree = 2021;
		System.out.println(yearThree);
	}

	public static void main(String[] args) {
		A3Car obj = new A3Car();
		obj.colourTwo= "Red";
		A3Car obj1 = new A3Car("White", 4);
		obj.manufacturer("sameera");
		obj.model();
		obj.year();
		obj1.year();
		obj.colourTwo= "Red";
		obj1.colourOne= "Yellow";
		//System.out.println(obj.colourTwo);
	}
}
