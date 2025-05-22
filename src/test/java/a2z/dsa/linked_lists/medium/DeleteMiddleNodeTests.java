package a2z.dsa.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.DeleteMiddleNode;
import a2z.dza.linked_lists.medium.RemoveNodeFromEndOfList;
import org.junit.Assert;
import org.junit.Test;

public class DeleteMiddleNodeTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,3,4,7,1,2,6});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{1,3,4,1,2,6});
        Assert.assertEquals(expected.getStringRepresentation(), DeleteMiddleNode.removeMiddleNode(head).getStringRepresentation());
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{1,2,4});
        Assert.assertEquals(expected.getStringRepresentation(), DeleteMiddleNode.removeMiddleNode(head).getStringRepresentation());
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{2,1});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{2});
        Assert.assertEquals(expected.getStringRepresentation(), DeleteMiddleNode.removeMiddleNode(head).getStringRepresentation());
    }

}
