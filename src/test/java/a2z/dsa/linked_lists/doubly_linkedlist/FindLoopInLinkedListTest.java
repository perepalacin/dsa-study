package a2z.dsa.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.FindLoopInLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class FindLoopInLinkedListTest {

    @Test
    public void Test1() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{3, 2,0, -4}, 1);
        Assert.assertTrue(FindLoopInLinkedList.findLoop(head));
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1,2}, 0);
        Assert.assertTrue(FindLoopInLinkedList.findLoop(head));
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1}, -1);
        Assert.assertFalse(FindLoopInLinkedList.findLoop(head));
    }
}
