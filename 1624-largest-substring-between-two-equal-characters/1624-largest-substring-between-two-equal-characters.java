class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> lastfreq = new HashMap<>();
        int n=s.length();
        int ans=-1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(lastfreq.containsKey(c))
                ans=Math.max(ans,i-lastfreq.get(c)-1);
            else
                lastfreq.put(c,i);
        }
        return ans;
    }
}