/**
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
**/
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //Corner case
        if (head == null) {
            return null;
        }

        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode slow = root;
        ListNode fast = root;

        //Move fast pointer n gap between i
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        //Move fast and slow
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return root.next;
    }
}
