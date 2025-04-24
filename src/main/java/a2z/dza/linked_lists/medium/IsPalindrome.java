// https://leetcode.com/problems/palindrome-linked-list/
package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

public class IsPalindrome {
    
    public static boolean isPalindrome (ListNode head) {
        int listLen = 0;
        if (head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            listLen++;
        }

        ListNode reversedHead = reverseLinkedList(slow);
        ListNode current = head;
        for (int i = 0; i < listLen; i++) {
            if (reversedHead.val != current.val) {
                return false;
            }
            current = current.next;
            reversedHead = reversedHead.next;
        }
        return true;
    }

    private static ListNode reverseLinkedList (ListNode head ) {
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
