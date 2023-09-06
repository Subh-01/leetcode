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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int baseS=n/k, extra=n%k;
        curr=head;
        
        List<ListNode> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            int partS=baseS + (extra>0?1:0);
            ListNode headP=null, tailP=null;
            for(int j=0;j<partS;j++){
                if(headP==null){
                    headP=tailP=curr;
                }else{
                    tailP.next=curr;
                    tailP=tailP.next;
                }
                if(curr!=null)
                    curr=curr.next;
            }
            if (tailP != null) {
                tailP.next = null;
            }

            ans.add(headP);
            extra =Math.max(extra - 1, 0);
        }
        return ans.toArray(new ListNode[0]);
    }
}