package BesantTech;

public class OverLoading {
	public static void main(String[] argss) {
		Loading1 obj = new Loading1();
		obj.test();
		obj.test(5);
		obj.test(5, 8);
		obj.test(5, 50.5);
		
	}

}
class Loading1{
	
	void test() {
		System.out.println("test()");
	}
	
	void test(int a) {
		System.out.println("test(a)" + "="+ a);
	}
	void test(int a, int b) {
		System.out.println("test(a,b)"+ "="+ (a+b));
	}
	
	void test(int a, double b) {
		System.out.println("test(a,b)"+"="+ (a+b));
	}
	
}
