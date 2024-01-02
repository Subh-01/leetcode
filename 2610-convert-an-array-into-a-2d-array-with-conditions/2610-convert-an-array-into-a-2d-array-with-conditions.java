class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

    while (!countMap.isEmpty()) {
    List<Integer> temp = new ArrayList<>();
    Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<Integer, Integer> entry = iterator.next();
        temp.add(entry.getKey());
        entry.setValue(entry.getValue() - 1);
        if (entry.getValue() == 0) {
            iterator.remove(); // Use iterator to safely remove the entry
        }
    }
    ans.add(temp);
}


        return ans;
    }
}