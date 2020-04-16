package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {
    private Stack<Integer> stack;
    private Map<Integer, Integer> map = new HashMap<>();

    public FreqStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        map.merge(x, 1, Integer::sum);
    }

    public int pop() {
            return stack.pop();
    }
}
