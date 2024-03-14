class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostSum(nums,goal)-atmostSum(nums,goal-1);
    }
    public int atmostSum(int arr[],int goal){
        if(goal<0) return 0;
//This function will give us the number of subarrays which is having the sum<=goal, means atmost the //sum can be goal, but additionally it will also count the subarrays having sum<goal.
       int i=0,j=0,sum=0,c=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>goal)
                sum-=arr[i++];
           
/*we do res = max(res, j-i+1) since there we have to find a max/min length subarray. Here we have to find total subarrays with sum<=k and when there is a valid window, the number of subarrays with sum<=k it will give is (j-i+1). Since if total sum of subarray is less than k, then all subarrays of this subarray will also have sum less than or equal to k. Hence we add that value to our answer.
*/
            c+=(j-i+1);
            j++;
        }
        return c;
    }
}