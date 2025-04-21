// https://leetcode.com/problems/middle-of-the-linked-list/description/
package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class MiddleOfLinkedList {

    public static ListNode middleNode(ListNode head) {
//        // My greedy approach!
//        ListNode current = head;
//        ListNode result = head;
//
//        if (head == null) {
//            return null;
//        }
//
//        int length = 0;
//        while (current != null) {
//            length++;
//            current = current.next;
//        }
//
//        int target = length / 2;
//
//        for (int i = 0; i < target; i++) {
//            result = result.next;
//        }
//        return result;

        //Using two pointer approach:
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;


    }

}
