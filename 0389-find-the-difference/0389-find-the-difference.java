class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char sc:s.toCharArray()) ans^=sc;
        for(char tc:t.toCharArray()) ans^=tc;
        
        return ans;
    }
}