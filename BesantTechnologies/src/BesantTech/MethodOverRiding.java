package BesantTech;
//run time polymorphism or dynamic polymorphism or method overriding
//static method cannot be used in method overriding
public class MethodOverRiding {
	public static void main(String[] args) {
		Method1 objone = new Method1();
		objone.test();
		Method2 objtwo = new Method2();
		objtwo.test();
		Method3 objthree = new Method3(); 
		objthree.test();
		 
	}
}

class Method1{
	
	void test() {
		System.out.println("method1class");
	}
}
class Method2 extends Method1{
	
}
class Method3 extends Method2 {
	void test() {
		int x=5;
				int y=6;
				int sum = x+y;
				System.out.println(sum);
	}
}