package BesantTech;

public class ForLoopEgThree {
	public static void main(String[] args) {
		int a=1;
		char ch= 'c';
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				System.out.print(a);
				//System.out.println();
				//System.out.println(ch);
				a++;
				//ch--;
				
			}
			else {
				System.out.print("*");
				
				//System.out.println("*");
			}
			
		}
	}

}
/*
 * ouput
 * 
 * 3*2*1 c*b*a 32123
 */