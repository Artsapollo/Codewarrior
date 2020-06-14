package leetcode.TopInterviewQuestions.linkedList;

import Nodes.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode next = head; //2
        ListNode cur = head; //1
        ListNode prev = null; //1

        while (cur != null) {
            next = cur.next; //2

            cur.next = prev; //null
            //prev = null, cur = 1, cur.next = null

            prev = cur; //1
            //prev = 1, cur = 1, cur.next = null

            cur = next; //2
            //prev = 1, cur = 2, cur.next = null
        }

        return prev;
    }
}
























