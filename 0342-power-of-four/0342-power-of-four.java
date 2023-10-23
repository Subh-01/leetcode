class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
         if(n!=0 && n==1)
        return true;
     return n%4==0 && isPowerOfFour(n/4);   
    }
}