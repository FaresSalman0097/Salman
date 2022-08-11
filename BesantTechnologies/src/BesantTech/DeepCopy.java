package BesantTech;

public class DeepCopy {
	public static void main(String[] args) {
		Deep d1= new Deep();
		Deep d2= new Deep();
	System.out.println(d1.val);
	System.out.println(d2.val);
	d1.val=75;
	System.out.println(d1.val);
	System.out.println(d2.val);
	}

}
class Deep{
	int val = 10;
}