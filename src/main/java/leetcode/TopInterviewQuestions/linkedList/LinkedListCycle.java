package leetcode.TopInterviewQuestions.linkedList;

import Nodes.ListNode;
/*
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        if (head.next == head) return true;

        ListNode nextNode = head.next;
        head.next = head;
        boolean isCycle = hasCycle(nextNode);

        return isCycle;

    }
}
