package a2z.dza.linked_lists.one_dim_linkedlist;

import a2z.dza.linked_lists.ListNode;

public class DeleteNode {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

