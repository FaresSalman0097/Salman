package BesantTech;

public class ForLoopEgOne {
public static void main(String[] args) {
	char ch = 'x';
	for(int i=0;i<5;i++) {
		if(i%2==0) {
			System.out.print(ch);
			ch++;
		}
		else {
			System.out.print("&");
		}
	}
}
}
