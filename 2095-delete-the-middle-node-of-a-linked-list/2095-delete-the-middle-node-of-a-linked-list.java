/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
        // List has 0 or 1 node, so nothing to delete
        return null;
    }
        ListNode slow=head;
        ListNode fast=head;
         ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // Remove the middle node by updating the 'next' reference of the previous node
           prev.next = slow.next;
        
        return head;
    }
}