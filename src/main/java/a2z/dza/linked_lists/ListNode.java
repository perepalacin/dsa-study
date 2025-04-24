package a2z.dza.linked_lists;

public class ListNode {
    public int val;
    public ListNode next; //1D LinkedList
    public ListNode back; //Doubly Linked List (or 2D)
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createOneDimLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static ListNode createDoublyLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        ListNode previous = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current.back = previous;
            previous = previous.next;
            current = current.next;
        }
        return head;
    }

    public static ListNode createLinkedListWithCycle(int[] arr, int pos) {
        if (arr.length == 0) {
            return null;
        }
        ListNode cycleStart = null;
        ListNode head = new ListNode(arr[0]);
        if (pos == 0) {
            cycleStart = head;
        }
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
            if (pos == i) {
                cycleStart = current;
            }
        }
        current.next = cycleStart;
        return head;
    }

    public String getStringRepresentation () {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        
        while (current != null) {
            result.append(current.val + " - ");
            current = current.next;
        }

        return result.toString();

    }

}
