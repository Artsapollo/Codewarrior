package leetcode.TopInterviewQuestions.linkedList;

import Nodes.ListNode;
/*
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLinkedLists {

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode res = resultNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.next = l1;
                l1 = l1.next;
            } else {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        if (l1 == null) {
            res.next = l2;
        } else {
            res.next = l1;
        }

        return resultNode.next;
    }

}
