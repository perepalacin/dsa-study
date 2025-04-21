package a2z.dsa.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.MiddleOfLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class MiddleOfLinkedListTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5});
        ListNode current = head;
        Assert.assertNotNull(MiddleOfLinkedList.middleNode(current).val);
        Assert.assertEquals(3, MiddleOfLinkedList.middleNode(current).val);
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5,6});
        ListNode current = head;
        Assert.assertNotNull(MiddleOfLinkedList.middleNode(current).val);
        Assert.assertEquals(4, MiddleOfLinkedList.middleNode(current).val);
    }

}
