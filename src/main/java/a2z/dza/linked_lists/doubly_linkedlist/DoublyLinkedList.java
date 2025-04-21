package a2z.dza.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;

public class DoublyLinkedList {

    public static ListNode insertAtTail(ListNode head, int newVal) {
        ListNode current = head;
        ListNode newNode = new ListNode(newVal);
        if (head == null) {
            return newNode;
        }
        while (current.next != null) {
            current = current.next;
        }
        newNode.back = current;
        current.next = newNode;
        return head;
    }
}

