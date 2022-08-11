package BesantTech;

public class SwitchCaseEx {
	public static void main(String[] args) {
		int month = 1;
		String monthString ;
		switch(month) {
		case 1:monthString="1-JAN";
		break;
		case 2:monthString="2-FEB";
		break;
		case 3:monthString="3-MAR";
		break;
		case 4:monthString="4-APR";
		break;
		case 5:monthString="5-MAy";
		break;
		case 6:monthString="6-JUN";
		break;
		default:monthString="END OF WORLD!!!"; 
		}
		System.out.println(monthString);
	}
}