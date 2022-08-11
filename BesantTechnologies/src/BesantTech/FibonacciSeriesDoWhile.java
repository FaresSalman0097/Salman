package BesantTech;

public class FibonacciSeriesDoWhile {
	public static void main(String[]args) {
		int a=0,b=1,c;
		int i=1;
		c=a+b;
		System.out.print(a+" "+b);
		do {
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
			i++;
			
		}while(i<=8);
	}

}
