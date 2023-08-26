class Solution {
    public int findLongestChain(int[][] pairs) {
   
    Arrays.sort(pairs, (x, y) -> x[1] - y[1]);
    int c=0,cur=Integer.MIN_VALUE;
         for (int[] pair : pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                c++;
            }
        }
        return c;
    } 
}   