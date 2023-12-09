class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int n:nums){
            if(n==0) z++;
            else if(n==1) o++;
            else t++;
        }
        //int ans[]=new int[nums.length];
        for(int i=0;i<z;i++)
            nums[i]=0;
        
         for(int i=z;i<z+o;i++)
            nums[i]=1;
        
         for(int i=z+o;i<z+o+t;i++)
            nums[i]=2;
    }
}