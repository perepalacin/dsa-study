package a2z.dza.linked_lists.one_dim_linkedlist;

import a2z.dza.linked_lists.ListNode;

public class FindLengthInLinkedList {

    public static int findLength(ListNode head) {
        int result = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            result++;
        }
        return result;
    }

}
