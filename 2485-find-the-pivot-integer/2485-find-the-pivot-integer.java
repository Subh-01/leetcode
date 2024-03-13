class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int sum=n*(n+1)/2;
        int t=0;
        for(int i=1;i<=n;i++){
            t+=i;
            if(t>sum/2){
                if(t==(sum-t+i))
                    return i;
            }
        }
        return -1;
    }
}