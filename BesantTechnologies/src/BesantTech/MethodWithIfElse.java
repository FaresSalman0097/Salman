package BesantTech;

public class MethodWithIfElse {
	static void ageCheck(int age) {
		if(age<18) {
			System.out.println("Access denied");
		}else {
			System.out.println("Access granted");
		}
	}
	public static void main(String args[]) {
		ageCheck(25);
	}
}
