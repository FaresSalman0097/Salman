package BesantTech;

public class StaticAndNonStatic {
		static int x=11;
		int y =12;
		
		static void give() {
			int x= 4;
			int y=5;
			int z = x+y;
			System.out.println("printing z " + z);
			StaticAndNonStatic.given();
		}
		static void given() {
			System.out.println("getting output");
		}
		void getting() {
			System.out.println("Print");
		}
		public static void main(String[] args) {
			StaticAndNonStatic.give();
			StaticAndNonStatic object1 = new StaticAndNonStatic();
			object1.getting();
			System.out.println(object1.y);
			System.out.println(StaticAndNonStatic.x);
		}

}
