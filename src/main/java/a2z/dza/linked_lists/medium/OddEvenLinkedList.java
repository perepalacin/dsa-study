// https://leetcode.com/problems/odd-even-linked-list/description/
package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if  (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddTail = head;
        ListNode evenTail = head.next;
        ListNode evenHead = head.next;

        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = oddTail.next;
            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        }

        oddTail.next = evenHead;
        return head;
    }
}
