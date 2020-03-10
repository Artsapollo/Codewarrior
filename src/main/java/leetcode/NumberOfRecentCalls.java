package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {

    }
}

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        //add ping to queue
        queue.offer(t);

        //if ping is greater than 3000 remove last added element
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }

        return queue.size();
    }
}