package practice;

public class A18NestedIf {
	public static void main(String[] args) {
		int a1 = 70, a2 = 60, a3 = 90;
		if (a1 >= a2) {
			if (a1 >= a3) {
				System.out.println("a1 is the greatest");
			} else {
				System.out.println("a3 is the greatest");
			}
		} else {
			if (a2 >= a3) {
				System.out.println("a2 is the greatest");
			} else {
				System.out.println("a3 is the greatest");
			}

		}
	}
}
