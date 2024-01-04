class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        int count=0;
        // Iterate through the entries in the HashMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Get the frequency count of the current element
            int t = entry.getValue();
            
            // If there is only one occurrence of any element, it's not possible to make it divisible by 3
            if (t == 1)
                return -1;
            
            // Calculate the number of operations needed to make the frequency divisible by 3
            count += t / 3; // Count the complete sets of 3 elements
            if (t % 3 != 0) // If there are remaining elements, increment the count
                count++;
        }
        return count;
    }
}