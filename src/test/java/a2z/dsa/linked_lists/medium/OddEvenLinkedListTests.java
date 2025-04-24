package a2z.dsa.linked_lists.medium;

import org.junit.Assert;
import org.junit.Test;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.OddEvenLinkedList;

public class OddEvenLinkedListTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{1,3,5,2,4});
        ListNode result = OddEvenLinkedList.oddEvenList(head);
        Assert.assertTrue(expected.getStringRepresentation().equals(result.getStringRepresentation()));
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{2,1,3,5,6,4,7});
        ListNode expected = ListNode.createOneDimLinkedList(new int[]{2,3,6,7,1,5,4});
        ListNode result = OddEvenLinkedList.oddEvenList(head);
        Assert.assertTrue(expected.getStringRepresentation().equals(result.getStringRepresentation()));
    }
}
