package leetcode.stackTasks;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }

    public static boolean backspaceCompare(String S, String T) {
        return check(S).equals(check(T));
    }

    public static String check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!isOperator(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.size() != 0) {
                stack.pop();
            }
        }
        return stack.toString();
    }

    public static boolean isOperator(char c) {
        return c == '#';
    }
}
