package practice;

public class A02AreaAndCircumferenceOfCircle {
	public static void main(String[] args) {
		int radius = 5;
		// area of the circle = pi*r*r
		double pi = Math.PI;
		double area = pi * radius * radius;
		System.out.println("Area of circle =" + area);
		// Circumference of the circle = 2*pi*r
		double circumference = 2 * pi * radius;
		System.out.println("Circumference of the circle =" + circumference);
	}
}
