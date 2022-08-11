package BesantTech;

public class MethodUsingMutipleParameters {
	static void methodOne(String name,int age,String place) {
		System.out.println(name +" is "+age+" from "+place);
	}
	public static void main(String args[]) {
		methodOne("Salman",28,"Nellai");
		methodOne("Sameera",25,"Nellai");	
	}
}
