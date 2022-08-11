package practice;

public class A06UnaryPostAndPre {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a); // 5
		a++;
		System.out.println(a); // 6
		++a;
		System.out.println(a); // 7
		a--;
		System.out.println(a); // 6
		System.out.println(++a); // 7
		System.out.println(a++); // 7
		System.out.println(a); // 8
		System.out.println(a--); // 8
		System.out.println(a); // 7
		System.out.println(--a); // 6
	}
}
