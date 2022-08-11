package interview;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {
	public static void charactersPresent(String str1, String str2) {
		StringBuilder Op1 = new StringBuilder();
		StringBuilder Op2 = new StringBuilder();
		int p = 0;
		for (int j = 0; j < str1.length(); j++) {
			boolean isMatched = false;
			for (p = 0; p < str2.length(); p++) {
				if (str1.charAt(j) == str2.charAt(p)) {
					isMatched = true;
					break;
				}
			}
			if (!isMatched) {
				Op1 = (Op1.append(str1.charAt(j)));
			}
		}
		System.out.println(Op1);

		for (int j = 0; j < str2.length(); j++) {
			boolean isMatched = false;
			for (p = 0; p < str1.length(); p++) {
				if (str2.charAt(j) == str1.charAt(p)) {
					isMatched = true;
					break;
				}
			}
			if (!isMatched) {
				Op2 = (Op2.append(str2.charAt(j)));
			}
		}
		System.out.println(Op2);
	}

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the First string :");
		String str1 = str.nextLine();
		System.out.println("Enter the Second string :");
		String str2 = str.nextLine();
		charactersPresent(str1, str2);
	}
}