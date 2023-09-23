class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        HashMap<String,Integer> dp=new HashMap<>();
        int max=0;
        for(String word: words){
            dp.put(word,1);
            for(int i=0;i<word.length();i++){
                String prevW=word.substring(0,i)+word.substring(i+1);
                if (dp.containsKey(prevW)) 
                dp.put(word,Math.max(dp.get(word),dp.get(prevW)+1));
            }
            max=Math.max(max,dp.get(word));
        }
        return max;
    }
}