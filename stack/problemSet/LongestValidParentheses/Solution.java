package LongestValidParentheses;

import java.util.*;
import java.lang.*;

class Solution {
	public static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		int MAX = 0;
		stack.push(-1);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push(i);
			else {
				stack.pop();
				if (stack.empty())
					stack.push(i);
				else
					MAX = Math.max(MAX, i - stack.peek());
			}
		}

		return MAX;

	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()"));
		System.out.println(longestValidParentheses(")()())"));
		System.out.println(longestValidParentheses(""));
		System.out.println(longestValidParentheses("("));
		System.out.println(longestValidParentheses(")"));
	}
}
