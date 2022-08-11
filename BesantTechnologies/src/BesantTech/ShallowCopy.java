package BesantTech;

public class ShallowCopy {
	public static void main(String[]args) {
	Shawllow d3 = new Shawllow();
	Shawllow d4=d3;
	System.out.println(d3.val1);
	System.out.println(d4.val1);
	d3.val1= 7;
	System.out.println(d3.val1);
	System.out.println(d4.val1);
	}
}
class Shawllow{
	int val1 = 5;
}