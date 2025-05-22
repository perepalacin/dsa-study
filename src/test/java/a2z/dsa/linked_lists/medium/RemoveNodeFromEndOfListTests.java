package a2z.dsa.linked_lists.medium;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.OddEvenLinkedList;
import a2z.dza.linked_lists.medium.RemoveNodeFromEndOfList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNodeFromEndOfListTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{1,2,3,5});
        ListNode result = RemoveNodeFromEndOfList.removeNthFromEnd(head, 2);
        Assert.assertEquals(expected.getStringRepresentation(), result.getStringRepresentation());
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{1,2,3,4});
        ListNode result = RemoveNodeFromEndOfList.removeNthFromEnd(head, 1);
        Assert.assertEquals(expected.getStringRepresentation(), result.getStringRepresentation());
    }

//    @Test
//    public void Test4() {
//        ListNode head = ListNode.createOneDimLinkedList(new int[]{1});
//        ListNode expected = ListNode.createOneDimLinkedList(new int[]{});
//        ListNode result = RemoveNodeFromEndOfList.removeNthFromEnd(head, 1);
//        Assert.assertEquals(expected.getStringRepresentation(), result.getStringRepresentation());
//    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{2});
        ListNode result = RemoveNodeFromEndOfList.removeNthFromEnd(head, 2);
        Assert.assertEquals(expected.getStringRepresentation(), result.getStringRepresentation());
    }
}
