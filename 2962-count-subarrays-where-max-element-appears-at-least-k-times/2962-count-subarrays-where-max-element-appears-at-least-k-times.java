class Solution {
    public long countSubarrays(int[] nums, int k) {
        int  n = nums.length; // Number of elements in the input vector
        int maxi = 0;   // Maximum value in the vector
            for(int x:nums)
                if(x>maxi)maxi=x;
        int i = 0, j = 0, cnt = 0; // Initialize pointers and counters
long ans = 0;
        
        for (j = 0; j < n; j++) {
            if (nums[j] == maxi) {
                cnt++; // Increment count when the element is equal to the maximum value
            }
            if (cnt >= k) {
                // Slide the window from the left side and count subarrays containing the maximum element
                for (; cnt >= k; i++) {
                    ans += n - j; // Count subarrays where maximum element is from j to n-1
                    if (nums[i] == maxi) {
                        cnt--; // Decrease count as the window slides
                    }
                }
            }
        }
        return ans; // Return the total count of subarrays
    }
}