package a2z.dza.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;

import java.util.HashSet;

public class FindStartOfLoopCycle {

    public static ListNode findStart(ListNode head) {
//        // Solution with hashsets
//        HashSet<ListNode> visitedNodes = new HashSet<>();
//        ListNode current = head;
//        while (current != null) {
//            if (visitedNodes.contains(current)) {
//                return current;
//            } else {
//                visitedNodes.add(current);
//            }
//
//            current = current.next;
//        }
//        return current;

        // Solution without Turtoise approach:
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
            return null;
        }

        //They will always meet there because slow and fast meet
        //at a distance = from heat to start of cycle!
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;

    }

}
