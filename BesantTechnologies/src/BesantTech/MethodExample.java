package BesantTech;

public class MethodExample {
	static int add(int arg1, int arg2)
	{
	int sum=arg1+arg2;
	return square(sum);
	}
	static int square(int arg)
	{
	int res=arg*arg;
	return res;
	}
	public static void main(String[] args)
	{
	int val= add(4,2);
	// int val1=square(5);
	System.out.println(val);
	//System.out.println(val1);
	}

}
