package a2z.dsa.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.FindStartOfLoopCycle;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class FindStartOfLoopCycleTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{3,2,0,-4}, 1);
        Assert.assertEquals(FindStartOfLoopCycle.findStart(head).val,2);
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1,2}, 0);
        Assert.assertEquals(FindStartOfLoopCycle.findStart(head).val,1);
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1}, -1);
        Assert.assertNull(FindStartOfLoopCycle.findStart(head));
    }
}
