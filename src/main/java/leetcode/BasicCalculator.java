package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ),
the plus + or minus sign -, non-negative integers and empty spaces .
 */
public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("FIRST: " + calculate("1 + 1"));
        System.out.println("SECOND: " + calculate(" 2-1 + 2 "));
        System.out.println("THIRD: " + calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public static int calculate(String s) {
        List<Character> numbers = new ArrayList<>();
        List<Character> symbols = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numbers.add(s.charAt(i));
            } else if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') {
                symbols.add(s.charAt(i));
            }
        }

        return 1;
    }
}
