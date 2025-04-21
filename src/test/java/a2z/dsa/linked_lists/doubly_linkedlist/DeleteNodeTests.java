package a2z.dsa.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.doubly_linkedlist.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{4, 5, 1, 9, 10});
        ListNode current = head;
        while (current.next != null) {
            if (current.val == 1) {
                break;
            }
            current = current.next;
        }

        Assert.assertEquals(4, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(9, head.next.next.val);
        Assert.assertEquals(10, head.next.next.next.val);
        Assert.assertNull(head.next.next.next.next);
    }

}
