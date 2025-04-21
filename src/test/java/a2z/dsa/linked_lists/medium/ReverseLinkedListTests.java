package a2z.dsa.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.MiddleOfLinkedList;
import a2z.dza.linked_lists.medium.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5});
        ListNode reversedHead = ReverseLinkedList.reverseLinkedList(head);
        Assert.assertEquals(5, reversedHead.val);
        Assert.assertEquals(4, reversedHead.next.val);
        Assert.assertEquals(3, reversedHead.next.next.val);
        Assert.assertEquals(2, reversedHead.next.next.next.val);
        Assert.assertEquals(1, reversedHead.next.next.next.next.val);
        Assert.assertNull(reversedHead.next.next.next.next.next);
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2});
        ListNode reversedHead = ReverseLinkedList.reverseLinkedList(head);
        Assert.assertEquals(2, reversedHead.val);
        Assert.assertEquals(1, reversedHead.next.val);
        Assert.assertNull(reversedHead.next.next);
    }
}
