package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class LengthOfLoop {

    public static int lengthOfLoop (ListNode head) {
        ListNode slow = head, fast = head;
        boolean found = false;
        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                found = true;
                break;
            }
        }
        if (!found) {
            return 0;
        }

        fast = fast.next;
        int length = 1;
        while (fast != slow) {
            fast = fast.next;
            length++;
        }
        return length;
    }
}
