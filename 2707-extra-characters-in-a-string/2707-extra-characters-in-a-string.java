class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n=s.length()+1;
        int dp[]=new int[n];
        Arrays.fill(dp,n);
        dp[0]=0;
        
        HashSet<String> set=new HashSet<>(Arrays.asList(dictionary));
        for(int i=1;i<=n-1;i++){
            dp[i]=dp[i-1]+1;
            for(int j=1;j<=i;j++){
                if(set.contains(s.substring(i-j,i)))
                    dp[i]=Math.min(dp[i],dp[i-j]);
            }
        }
        return dp[n-1];
    }
}
