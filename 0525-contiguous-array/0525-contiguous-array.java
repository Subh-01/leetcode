class Solution {
    public int findMaxLength(int[] nums) {
     int maxLen = 0;
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); // Initialize the map with 0 at index -1

    for (int i = 0; i < nums.length; i++) {
        // If nums[i] is 0, decrement count; if it's 1, increment count
        count += nums[i] == 0 ? -1 : 1;

        // If the count is already in the map, update maxLen
        if (map.containsKey(count)) {
            maxLen = Math.max(maxLen, i - map.get(count));
        } else {
            // If count is not in the map, put it in the map
            map.put(count, i);
        }
    }

    return maxLen;
    }
}