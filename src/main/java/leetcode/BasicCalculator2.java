package leetcode;

import java.util.*;

public class BasicCalculator2 {
    static Map<String, Integer> priorities = new HashMap<>();

    public static void main(String[] args) {
//        System.out.println("FIRST: " + calculate("3+2*2"));
//        System.out.println("SECOND: " + calculate(" 3/2 "));
//        System.out.println("THIRD: " + calculate(" 3+5 / 2 "));
//        System.out.println("FOURS: " + calculate("0-2147483647"));
//        System.out.println("FIFTH: " + calculate("1-1+1"));
//        System.out.println("FIFTH: " + calculate("1*2-3/4+5*6-7*8+9/10"));
//        System.out.println("SIXTH: " + calculate("2-3-4"));
        System.out.println("SIXTH: " + calculate("1*2+3*4-5*6+7*8-9*10"));
        //1*2+3*4-5*6+7*8-9*10
        //1 2 * 3 4 * 5 6 * 7 8 * 9 10 * - + - +
        //2 12 30 56 90 - + - +
        //2 12 30 -34 + - +
        //2 12 -4 - +
        //2 16 +
        //18

        //2 12 30 56 90 + - + -
        //2 12 30 146 - + -
        //2 12 -116 + -
        //2 -134 -
        //-132



//  a   b  symbol = '-'
//  2  -26  -  = -24

//  a  b  symbol = '-'
// -1  4 -  = -5
    }

    public static int evaluate(int a, int b, String symbol) {
        if (b < 0 && symbol.equals("-")) {
            symbol = "+";
        }
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

    public static int calculate(String s) {
        priorities.put("+", 0);
        priorities.put("-", 0);
        priorities.put("*", 1);
        priorities.put("/", 1);
        List symbols = Arrays.asList("+", "-", "*", "/");

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
            } else {
                if (!stack.empty()) {
                    if (priorities.get(stack.peek()) >= priorities.get(c)) {
                        result.add(stack.pop());
                        stack.push(c);
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
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
            } else {
                result.add(buffer.toString());
                buffer.setLength(0);
                result.add(String.valueOf(c));
            }
        }

        return result;
    }

    public static boolean isDigit(String s) {
        return Character.isDigit(s.charAt(0));
    }
}


/*
public static int calculate(String s) {
        char operator = '+';
        int currentNumber = 0;
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                currentNumber = 10 * currentNumber + curr - '0';
            }
            if (!Character.isDigit(curr) && curr != ' ' || i != s.length() - 1) {
                if (operator == '+') {
                    stack.push(currentNumber);
                }
                if (operator == '-') {
                    stack.push(-currentNumber);
                }
                if (operator == '*') {
                    stack.push(stack.pop() * currentNumber);
                }
                if (operator == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operator = curr;
                currentNumber = 0;
            }
        }

        for (int number : stack) {
            result += number;
        }
        return result;
    }
 */