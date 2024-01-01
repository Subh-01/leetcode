class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        long l=0,r=(long)Math.sqrt(c);
        while(l<=r){
            if(l*l+r*r==c) return true;
            else if(l*l+r*r>c) r--;
            else l++;
        }
        return false;
    }
}