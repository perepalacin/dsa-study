package a2z.dsa.linked_lists.medium;

import org.junit.Assert;
import org.junit.Test;

import a2z.dza.linked_lists.ListNode;
import a2z.dza.linked_lists.medium.IsPalindrome;

public class IsPalindromeTests {
    
    @Test
    public void Test1() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,2,1});
        Assert.assertTrue(IsPalindrome.isPalindrome(head));
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2,3,3,2,1});
        Assert.assertTrue(IsPalindrome.isPalindrome(head));
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createOneDimLinkedList(new int[]{1,2});
        Assert.assertFalse(IsPalindrome.isPalindrome(head));
    }

}
