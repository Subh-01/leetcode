class Solution {
    public String reverseWords(String s) {
       String[] words = s.split("\\s+");
        String reverse="";
        for(String str:words){
            reverse+=rev(str);
            reverse+=" ";
        }
        return reverse.substring(0,s.length());
        
    }
    public String rev(String str){
        String r="";
        for(int i=str.length()-1;i>=0;i--){
            r+=(str.charAt(i))+"";
        }
        return r;
    }
}