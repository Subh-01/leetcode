class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int frq=n/3;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
    if (value > frq) {
        ans.add(key);
    }
        }
        return ans;
    }
}