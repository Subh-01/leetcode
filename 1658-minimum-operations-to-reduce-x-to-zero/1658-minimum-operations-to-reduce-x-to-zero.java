class Solution {
    public int minOperations(int[] nums, int x) {
        int target=0,sum=0;
        for(int n:nums)sum+=n;
        
        target=sum-x;
        int j=0,min=Integer.MIN_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(j<=i && sum>target){
                sum-=nums[j];
                j++;
            }
            if(sum==target) min=Math.max(min,i-j+1);
        }
        return min==Integer.MIN_VALUE?-1:nums.length-min;
    }
}