package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println("FIRST: " + evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println("SECOND: " + evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println("THIRD: " + evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    public static int evalRPN(String[] tokens) {
        List symbols = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();

        for (String n : tokens) {
            if (!symbols.contains(n)) {
                stack.push(Integer.valueOf(n));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(evaluate(a, b, n));
            }
        }
        return stack.get(0);
    }

    public static int evaluate(int a, int b, String symbol) {
        if (symbol.equals("+")) {
            return a + b;
        } else if (symbol.equals("-")) {
            return a - b;
        } else if (symbol.equals("*")) {
            return a * b;
        } else if (symbol.equals("/")) {
            return a / b;
        }
        return 0;
    }
}
