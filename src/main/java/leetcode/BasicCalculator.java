package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ),
the plus + or minus sign -, non-negative integers and empty spaces .
 */
public class BasicCalculator {

    public static void main(String[] args) {
//        System.out.println("FIRST: " + calculate("1 + 1"));
//        System.out.println("SECOND: " + calculate(" 2-1 + 2 "));
        System.out.println("THIRD: " + calculate("(1+(4+5+2)-33)+(46+81)"));
    }

    public static int calculate(String s) {
        List symbols = Arrays.asList("+", "-");

        List<String> tokenized = tokenize(s.replaceAll(" ", ""));
        List<String> parsed = parse(tokenized);

        Stack<Integer> result = new Stack<>();

        for (String p : parsed) {
            if (!symbols.contains(p)) {
                result.push(Integer.valueOf(p));
            } else {
                int b = result.pop();
                int a = result.pop();
                result.push(evaluate(a, b, p));
            }
        }

        return result.get(0);
    }

    public static List<String> parse(List<String> tokenized) {
        List<String> result = new ArrayList<>(); //числа
        Stack<String> stack = new Stack<>(); //знаки

        for (int i = 0; i < tokenized.size(); i++) {
            String c = tokenized.get(i);
            if (isDigit(c)) {
                result.add(c);
            } else if (isOperator(c)) {
                if (!stack.empty() && isOperator(stack.peek())) {
                    result.add(stack.pop());
                    stack.push(c);
                } else {
                    stack.push(c);
                }
            } else if (isLeftParenthesis(c.charAt(0))) {
                stack.push(c);
            } else {
                while (!stack.empty() && isOperator(stack.peek())) {
                    result.add(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

    public static List<String> tokenize(String s) { //Собирает цифры в один символ
        List<String> result = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) && i != s.length() - 1) {
                buffer.append(c);
            } else if (Character.isDigit(c) && i == s.length() - 1) {
                buffer.append(c);
                result.add(buffer.toString());
                buffer.setLength(0);
            } else if (isLeftParenthesis(c)) {
                result.add(String.valueOf(c));
            } else if (isRightParenthesis(c)) {
                if (buffer.length() != 0) {
                    result.add(buffer.toString());
                    buffer.setLength(0);
                    result.add(String.valueOf(c));
                } else {
                    result.add(String.valueOf(c));
                }
            } else if (!Character.isDigit(c) && buffer.length() != 0) {
                result.add(buffer.toString());
                buffer.setLength(0);
                result.add(String.valueOf(c));
            } else {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }

    public static int evaluate(int a, int b, String symbol) {
        if (symbol.equals("+")) {
            return a + b;
        } else if (symbol.equals("-")) {
            return a - b;
        }
        return 0;
    }


    public static boolean isDigit(String s) {
        return Character.isDigit(s.charAt(0));
    }

    public static boolean isOperator(String s) {
        List<String> operators = Arrays.asList("+", "-");
        return operators.contains(s);
    }

    public static boolean isRightParenthesis(char c) {
        return (c == ')');
    }

    public static boolean isLeftParenthesis(char c) {
        return (c == '(');

    }
}
