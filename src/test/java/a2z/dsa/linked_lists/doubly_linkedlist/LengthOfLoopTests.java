package a2z.dsa.linked_lists.doubly_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.LengthOfLoop;
import org.junit.Assert;
import org.junit.Test;

public class LengthOfLoopTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{3,2,0,-4}, 1);
        Assert.assertEquals(3, LengthOfLoop.lengthOfLoop(head));
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1,2}, 0);
        Assert.assertEquals(2, LengthOfLoop.lengthOfLoop(head));
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createLinkedListWithCycle(new int[]{1}, -1);
        Assert.assertEquals(0, LengthOfLoop.lengthOfLoop(head));
    }
}
