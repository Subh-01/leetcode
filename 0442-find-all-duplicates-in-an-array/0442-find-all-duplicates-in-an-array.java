class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> newList = new ArrayList<Integer>();   
        HashSet <Integer> set=new HashSet<>();
     int n=nums.length;
     for(int i=0;i<n;i++){
                  if(set.add(nums[i])==false){
             newList.add(nums[i]);
         }
     }   
     return newList;
    }
}