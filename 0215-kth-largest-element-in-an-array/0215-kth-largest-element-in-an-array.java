class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        
        for(int n:nums)
        pq.offer(n);       //6,5,4,3,2,1

        while(--k>0)
        pq.poll();
        

        return pq.poll();
    }
}