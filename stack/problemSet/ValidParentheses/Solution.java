import java.util.*;

class Solution {
	public static boolean isValid(String s) {

		if (s.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (!stack.empty() && stack.peek() == '(' && c == ')') {
				stack.pop();
			} else if (c == ')') {
				stack.push(c);
			} else if (c == '[') {
				stack.push(c);
			} else if (!stack.empty() && stack.peek() == '[' && c == ']') {
				stack.pop();
			} else if (c == ']') {
				stack.push(c);
			} else if (c == '{') {
				stack.push(c);
			} else if (!stack.empty() && stack.peek() == '{' && c == '}') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.empty();
	}

	public static void main(String[] args) {
		System.out.println(Solution.isValid("]"));
		System.out.println(Solution.isValid("([])"));
		System.out.println(isValid(""));
	}
}
