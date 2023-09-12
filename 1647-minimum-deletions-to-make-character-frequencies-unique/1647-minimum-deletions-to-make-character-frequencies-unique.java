class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      
        HashSet<Integer> frequencies = new HashSet<>();
        int deletions = 0;
       //  Iterate through the character frequencies
    for (int freq : map.values()) {
        // Keep decrementing the frequency until it becomes unique
        while (frequencies.contains(freq)) {
            freq--;
            deletions++;
        }
         // Add the unique frequency to the HashSet
        if(freq>0)frequencies.add(freq);
    }
        
    return deletions;
    }
}
 