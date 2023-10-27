class Solution {
    public String longestPalindrome(String s) {
       int start=0;
       int end=s.length()-1;
       int ans=0;
       int next=0;
       String res="";
       while(start<=end){
           while(next<=end){
               if(check(next,end,s)){
                   if(ans>=(end-next+1))
                   break;

                   res=s.substring(next,end+1);
                   ans=end-next+1;
                   break;
               }
               end--;
           }
           start++;
           next=start;
           
           end=s.length()-1;
       } 
       return res;
    }
    public boolean check(int start,int end,String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}