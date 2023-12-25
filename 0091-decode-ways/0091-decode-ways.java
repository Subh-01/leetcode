class Solution {
    int n=0;
    int dp[]=new int[101];
    public int numDecodings(String s) {
    n=s.length();
        Arrays.fill(dp,-1);
        return helper(s,0);
    }
    int helper(String str,int pos){
if(pos==n) return 1;
        if(str.charAt(pos)=='0') return 0;
        
        if(dp[pos] != -1) return dp[pos];
        
        int count=helper(str,pos+1);
        if(pos<n-1 && Integer.valueOf(str.substring(pos,pos+2))<=26){
            count+=helper(str,pos+2);
        }
        return dp[pos]=count;
    }
}