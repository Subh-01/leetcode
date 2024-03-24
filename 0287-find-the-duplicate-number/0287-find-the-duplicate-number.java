class Solution {
    public int findDuplicate(int[] nums) {
         int low = 0,high = nums.length - 1,cnt;
        while(low <= high){
            int mid = low + (high - low)/2;
            cnt = 0;
            for(int num:nums){
                if(num <= mid){
                    cnt++;
                }
            }
            if(cnt <= mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    return low; 
    }
}