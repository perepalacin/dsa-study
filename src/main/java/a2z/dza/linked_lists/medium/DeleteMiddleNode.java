package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class DeleteMiddleNode {

    public static ListNode removeMiddleNode(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }

}
