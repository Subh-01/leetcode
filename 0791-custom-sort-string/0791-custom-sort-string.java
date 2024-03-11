class Solution {
    public String customSortString(String order, String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray())
            freq[c-'a']++;
        
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            while(freq[ch-'a']>0){
                sb.append(ch);
            freq[ch-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                sb.append((char)(i+'a'));
            freq[i]--;
            }
        }
        return sb.toString();
    }
}