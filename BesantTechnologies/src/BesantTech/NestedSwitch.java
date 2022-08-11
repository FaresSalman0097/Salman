package BesantTech;

public class NestedSwitch {
	public static void main(String[] args) {
		char section ='C';
		int year = 3;
		switch(year) {
		case 1:System.out.println("English");
			break;
		case 2:
			switch(section) {
			case 'A':System.out.println("Tamil");
				break;
			case 'B':System.out.println("Maths");
				break;
			case 'C':System.out.println("science");
				break;
			}
			break;
		case 3:
			switch(section) {
			case 'A':System.out.println("Social");
				break;
			case 'B':System.out.println("Chemistry");
				break;
			case 'C':System.out.println("Physics");
				break;
			}
			break;
			default:System.out.println("Immaculate");						
		}	
	}
}
