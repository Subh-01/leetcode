class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        int i=0,j=0;
        while(j<t.length()){
            char ch=s.charAt(i);
            if(t.charAt(j++)==ch)
                i++;
            if(i==s.length()) return true;
        }
        return false;
    }
}