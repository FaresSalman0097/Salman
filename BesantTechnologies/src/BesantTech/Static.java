package BesantTech;

public class Static {

	static int x = 5;
	int y=6;


	static void test() {
		x=7;
		run();
		//first(); we cannot call non static inside a static method directly
		System.out.println("August 15");
	}
	static void run()
	{
		System.out.println("August 22");
	}
	void first() {
		y=8;
		second();
		x=9;
		test();
		// we can call static members inside non static method
		System.out.println("September 11");
	}
	void second() {
		System.out.println("September 16");
	}
	public static void main(String[] args) {
		  System.out.println((Static.x));
		 // Static.y; we cannot call non static member using class name
		  Static.test();
		  Static.run();
		 // Static.first();we cannot call non static member using class name
		  
		  Static obj = new Static();
		  System.out.println((obj.y));
		  obj.first();
		  obj.second();
		  
		  //obj.test(); - allowed but not recommended
		  
		  
	}
}
