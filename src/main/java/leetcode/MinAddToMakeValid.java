package leetcode;

import java.util.Stack;

/*
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:
It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

Example 1:
Input: "())"
Output: 1
 */
public class MinAddToMakeValid {
    public static void main(String[] args) {
//        System.out.println(minAddToMakeValid("())"));
//        System.out.println(minAddToMakeValid("()"));
        System.out.println(minAddToMakeValid("((("));
//        System.out.println(minAddToMakeValid("()))(("));

    }

    public static int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') stack.push(c);
            else if (stack.empty()) stack.push(c);
            else if (c == ')' && stack.lastElement() != '('){
                stack.push(c);
            }else if (c == ')' && stack.lastElement() == '('){
                stack.pop();
            }
        }
        return stack.size();
    }
}
