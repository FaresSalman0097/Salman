package co.classesinjava;
public class A1Variables {
	int a = 95; // instance variable
	double b = 0097.00d; // instance variable
	A1Variables() {
		System.out.println("This is a constructor");
		System.out.println(a + " " + b);
	}
	A1Variables(int a, double b) {
		this.a = a;
		this.b = b;
		System.out.println("This is a Parameterised constructor");
	}
	static String name = "Salman"; // class varible
	public void method() {
		String name1 = "Sameera"; // local variable
		System.out.println(name1);
	}
	public static void main(String[] args) {
		// Syntax // ClassName objectName = new ClassName();
		A1Variables obj1 = new A1Variables();
		A1Variables obj2 = new A1Variables(97, 00.97);
		obj1.a = 97;
		System.out.println(obj1.a);
	}
}
