class Solution {
    public int maxFrequency(int[] nums, int k) {
        int i = 0, j;
        Arrays.sort(nums);
        long sum=0;
        int ans=1;
        for (j = 0; j < nums.length; ++j) {
            sum += nums[j];
            while(k < (long)nums[j] * (j - i + 1) - sum)
                sum -= nums[i++];
            
             ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}


/*
Why is (j - i + 1) * A[j] - sum <= k valid?
(j - i + 1) is the length of the window [i, j]. We want to increase all the numbers in the window to equal A[j], the number of operations needed is (j - i + 1) * A[j] - sum which should be <= k. For example, assume the window is [1,2,3], increasing all the numbers to 3 will take 3 * 3 - (1 + 2 + 3) operations.
*/