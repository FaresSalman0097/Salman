package BesantTech;

public class MethodOverRiding2 {
	
	public static void main(String[] args) {
		Over1 obj = new Over1();
		Over2 obj1 = new Over2();
		Over3 obj2 = new Over3();
		obj.test();
		obj1.test();
		obj2.test();
		
	}
	
}
class Over1{
	 void test() {
		 int a=5;
		 int b=6;
		 int c= a*b;
		System.out.println(c);
	}
}
class Over2 extends Over1{
	int a;
	void test() {
	
	System.out.println(a);
	}
	
}
class Over3 extends Over1{
	void test() {
		int a=9;
	System.out.println(a);
	}	
}