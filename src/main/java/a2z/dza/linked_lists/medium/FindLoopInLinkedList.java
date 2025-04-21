package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class FindLoopInLinkedList {

    public static boolean findLoop(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
