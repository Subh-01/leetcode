class Solution {
    public boolean find132pattern(int[] nums) {
     int n=(nums.length); 
        if(n<3)return false;
        
        Stack<Integer>st=new Stack<>();
        int max3=Integer.MIN_VALUE;
        
        for(int i=n-1;i>=0;i--){
            if(nums[i]<max3) return true;
            
            while(!st.isEmpty() && st.peek()<nums[i]){
                max3=st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}