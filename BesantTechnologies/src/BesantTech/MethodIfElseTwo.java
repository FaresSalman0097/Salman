package BesantTech;

public class MethodIfElseTwo {
	static boolean login(int pin) {
		if(pin==1234) {
			return true;		
		}else {
			return false;
		}
	}
public static void main(String args[]) {
	boolean res = login(4321);
	if(res==true) {
		System.out.println("Login successfull");
	}else {
		System.out.println("Login failed");
	}
}
}
