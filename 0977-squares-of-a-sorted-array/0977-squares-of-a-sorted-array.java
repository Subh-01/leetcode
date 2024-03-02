class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int ans[]=new int[j+1];
        for(int k=nums.length-1;k>=0;k--){
         if(Math.abs(nums[i]) > Math.abs(nums[j])){
             ans[k]=nums[i]*nums[i];
             i++;
         }   else{
              ans[k]=nums[j]*nums[j];
             j--;
         }
        }
        return ans;
    }
}