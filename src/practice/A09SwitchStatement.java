package practice;

public class A09SwitchStatement {

	public static void main(String[] args) {

		int mnth = 2;
		String month;
		switch (mnth) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		default:
			month = "No Month";
			break;
		}
		System.out.println(month);
	}

}
