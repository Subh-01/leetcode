class Solution {
    public int maxFrequencyElements(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            max=Math.max(max,map.get(n));
        }
        int sum=0;
        for(int f:map.values())
            if(f==max)
                sum+=f;
        
        return sum;
    }
}