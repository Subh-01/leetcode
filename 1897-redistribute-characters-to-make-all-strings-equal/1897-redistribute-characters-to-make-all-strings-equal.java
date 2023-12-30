class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=words.length;
        for(String s:words){
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()%n!=0) return false;
        }
        return true;
    }
}