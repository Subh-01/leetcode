class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums)
            if(set.add(x)==false)
                return x;
        
        return 0;
    }
}