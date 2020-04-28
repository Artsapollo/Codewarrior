package leetcode;

import Nodes.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        if((head == null) || (head.next == null)){
            return head;
        }

        ListNode carr = head.next;
        head.next = removeElements(head.next, val);
        if(carr.next != null && carr.next.val == val){
            carr.next = head;
        }

        return carr;
    }
}
