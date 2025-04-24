package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseLinkedList (ListNode head) {
//        // Iterative approach
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode current = head;
//        ListNode previous = null;
//
//        while (current != null) {
//            ListNode next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//
//        return previous;

        // Recursive approach
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseLinkedList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }
}
