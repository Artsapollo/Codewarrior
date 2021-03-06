package leetcode.TopInterviewQuestions.linkedList;

import Nodes.ListNode;
/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9]
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if(node != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
