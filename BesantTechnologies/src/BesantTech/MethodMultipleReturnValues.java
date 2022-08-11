package BesantTech;

public class MethodMultipleReturnValues{
	static int add(int arg1, int arg2)
	{
	int sum = arg1+arg2;
	return sum;
	}
	public static void main(String[] args)
	{
	int res1= add(7,5);
	System.out.println(res1);
	int res2= add(3,5);
	System.out.println(res2);
	}
}
