package practice;

public class A13Array2DExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] summaPodraen = { { 567, 989, 546, 789, 223, 564 }, { 878, 989, 565, 873, 546, 985 },
				{ 935, 697, 468, 653, 499, 235 } };
		System.out.println(summaPodraen);

		for (int i = 0; i < summaPodraen.length; i++) {
			for (int j = 0; j < summaPodraen[i].length; j++) {
				System.out.print(summaPodraen[i][j] + " ");
			}
			System.out.println();
		}
	}

}
