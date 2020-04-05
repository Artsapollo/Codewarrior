package leetcode;

import Nodes.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if((head == null) || (head.next == null)){
            return head;
        }

        ListNode carr = head.next;
        head.next = swapPairs(head.next.next);
        carr.next = head;

        return carr;
    }
}
