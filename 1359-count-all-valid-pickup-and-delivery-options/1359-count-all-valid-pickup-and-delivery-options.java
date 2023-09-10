class Solution {
    public int countOrders(int n) {
          int MOD = 1000000007;
  long c=1;
        for(int i=2;i<=n;i++){
            c=(c*i*(2*i-1))%MOD;         //n=2i  n(n-1)/2;
        }
        return (int)c;
    }
}