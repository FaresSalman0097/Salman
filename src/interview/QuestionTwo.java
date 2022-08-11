package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionTwo {
	public static void main(String args[]) {
		List<String> arrayF1 = new ArrayList<String>();
		// List<String> list = new ArrayList();
		arrayF1.add("U1,U2");
		arrayF1.add("U3,U4");
		arrayF1.add("U1,U5");
		arrayF1.add("U2,U1");
		arrayF1.add("U3,U4");

		System.out.println(arrayF1);

		LinkedHashSet<String> removingDuplicates = new LinkedHashSet<String>(arrayF1);

		ArrayList<String> arrayF2 = new ArrayList<String>(removingDuplicates);
		System.out.println("After removing duplicates");
		System.out.println(arrayF2);

	}
}
