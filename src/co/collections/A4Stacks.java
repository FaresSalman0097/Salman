package co.collections;

import java.util.Stack;

public class A4Stacks {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.add("salman");
		stk.push("Sameera");
		stk.push("Oh baby!");
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
	}
}
