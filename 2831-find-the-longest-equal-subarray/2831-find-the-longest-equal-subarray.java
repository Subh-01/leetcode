class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,max=0,c=0;
        int n=nums.size();
        for(int j=0;j<n;j++){
            map.put(nums.get(j),map.getOrDefault(nums.get(j),0)+1);
              max=Math.max(max,map.get(nums.get(j)));
            
     if (j - i + 1 - max > k) {
                map.put(nums.get(i), map.get(nums.get(i)) - 1);
                i++;
            }
        
          
        }
        
        return max;
    }
}