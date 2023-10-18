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
    public void reorderList(ListNode head) {
       if(head==null||head.next==null) return;
        
       ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        //ListNode mid=slow.next;
        
         //Start reverse from mid one by one 1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=slow;
            ListNode preCurrent=slow.next;
        
            while(preCurrent.next!=null){
                ListNode current=preCurrent.next; 
                preCurrent.next=current.next;
                current.next=preMiddle.next;
                preMiddle.next=current;
            }
         //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
         slow=head;
            fast=preMiddle.next;
            while(slow!=preMiddle){
                preMiddle.next=fast.next;
                fast.next=slow.next;
                slow.next=fast;
                slow=fast.next;
                fast=preMiddle.next;
            }
        
        
    }
}
