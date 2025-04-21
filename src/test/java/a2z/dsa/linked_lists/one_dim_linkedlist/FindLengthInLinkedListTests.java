package a2z.dsa.linked_lists.one_dim_linkedlist;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.one_dim_linkedlist.FindLengthInLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class FindLengthInLinkedListTests {

    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10});

        Assert.assertEquals(10, FindLengthInLinkedList.findLength(head));
    }
}
