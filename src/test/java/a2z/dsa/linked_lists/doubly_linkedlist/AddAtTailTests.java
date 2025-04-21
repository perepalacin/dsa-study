package a2z.dsa.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.doubly_linkedlist.DoublyLinkedList;
import a2z.dza.linked_lists.one_dim_linkedlist.DeleteNode;
import org.junit.Assert;
import org.junit.Test;

public class AddAtTailTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{4, 5, 1, 9});
        DoublyLinkedList.insertAtTail(head, 10);
        Assert.assertEquals(4, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(1, head.next.next.val);
        Assert.assertEquals(9, head.next.next.next.val);
        Assert.assertEquals(10, head.next.next.next.next.val);
        Assert.assertNull(head.next.next.next.next.next);
    }

}
