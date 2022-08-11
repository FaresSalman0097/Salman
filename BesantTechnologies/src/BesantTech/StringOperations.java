package BesantTech;

public class StringOperations {
public static void main(String[] args) {
	String a = " Chennai is awesome";
	char var=a.charAt(3);
	System.out.println(a.charAt(3));
	System.out.println(var);
	int d =a.length();
	System.out.println(a.length());
	System.out.println(d);
	char[] g =a.toCharArray();
	System.out.println(g);
	for(int i=0; i<d; i++) {
		System.out.println(g[i]);
	}
		int r = a.indexOf('e');
		System.out.println(a.indexOf('e'));
		int t = a.lastIndexOf('e');
		System.out.println(t);
		String f = a.trim();
		System.out.println(f);
		String y = a.toUpperCase();
		System.out.println(y);
		String u = a.toLowerCase();
		System.out.println(u);
		boolean o =a.contains("IS");
		System.out.println(o);		
		boolean p =a.endsWith("some");
		System.out.println(a.endsWith("some"));
		a.equals(" Chennai Is awesome");
		System.out.println(a.equals(" Chennai Is awesome"));
		a.equalsIgnoreCase(" Cheai is awesome");
		System.out.println(a.equalsIgnoreCase(" Chennai Is awesome"));
		int de= a.indexOf('s',5 );
		System.out.println(de);
}
	}

