class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2) return true;
        int direc=0;
        for(int i=0;i+1<nums.length;i++){
            if(nums[i]>nums[i+1]){  //decreasing
                if(direc==0) direc=-1;
                else if(direc==1) return false;
            }
            else if(nums[i]<nums[i+1]){  //increasing
                if(direc==0) direc=+1;
                else if(direc==-1) return false;
            }
        }
        return true;
    }
}