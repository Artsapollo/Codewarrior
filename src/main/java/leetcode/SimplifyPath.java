package leetcode;

import java.util.Stack;

// No doubling '/'
// No '/' after last word
// No not letters symbols after '/'
public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println("FIRST: " + simplifyPath("/home/user/penis/haslik//"));
        System.out.println("SECOND: " + simplifyPath("/a/../../b/../c//.//"));
        System.out.println("THIRD: " + simplifyPath("/a//b////c/d//././/.."));
        System.out.println("FOURS: " + simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String c : path.split("/")) {
            if (!c.equals("") && !c.equals(".") && !c.equals("..")) {
                stack.push("/");
                stack.push(c);
            } else if (c.equals("..") && !stack.empty() && !stack.peek().equals("/")) {
                stack.pop();
                stack.pop();
            }
        }
        if (stack.size() > 3 && stack.peek().equals("/")) {
            stack.pop();
        } else if (stack.empty()) {
            return "/";
        }

        return normal(stack);
    }

    private static String normal(Stack<String> stack) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stack) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}