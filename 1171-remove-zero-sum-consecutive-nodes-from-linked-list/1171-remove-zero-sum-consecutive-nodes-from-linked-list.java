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
    public ListNode removeZeroSumSublists(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int arr[]=new int[n];
            temp=head;
        int idx=0;
        while(temp!=null){
            arr[idx++]=temp.val;
                temp=temp.next;
        }
    
     for(int i=0;i<arr.length;i++){
         int sum=0;
       for(int j=i;j<arr.length;j++){
         sum+=arr[j];
           if(sum==0){
               for(int k=i;k<=j;k++)
                   arr[k]=0;
           }
     }   
     }
        if(arr.length==0) return null;
        ListNode h = null;
        ListNode start = null;
        for(int ele: arr){
            if(ele!=0){
                ListNode node =new ListNode(ele);
                if(h==null){
                    h=node;
                    start=h;
                }else{
                h.next=node;
                h=h.next;
            }
            }
        }
        return start;
    }
}