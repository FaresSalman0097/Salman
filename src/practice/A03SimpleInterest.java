package practice;

public class A03SimpleInterest {
	public static void main(String[] args) {
		long principal = 700000;
		int year = 1;
		double roi = 6;
		double simple_interest = (principal * year * roi) / 100;
		int si = (int) simple_interest;
		System.out.println(simple_interest);
		System.out.println(si);
	}
}
