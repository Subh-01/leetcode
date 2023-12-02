class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:chars.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        int res=0;
        for(String s:words){
            int len=s.length();
            char freq[]=new char[26];
            for(char c:s.toCharArray())
                freq[c-'a']++;
            
            for(int i=0;i<26;i++){
                if(map.getOrDefault((char)(i+'a'),0) < freq[i]){
                    len=0;
                    break;
                }
            }
            res+=len;
        }
        return res;
    }
}