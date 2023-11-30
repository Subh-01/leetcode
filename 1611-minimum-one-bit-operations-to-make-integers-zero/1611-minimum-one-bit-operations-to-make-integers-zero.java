class Solution {
    public int minimumOneBitOperations(int n) {
        int sign=1;
        int res=0;
        while(n>0){
            res+=n^(n-1)*sign;
            sign=-1*sign;
            n=n&n-1;
        }
        return Math.abs(res);
    }
}