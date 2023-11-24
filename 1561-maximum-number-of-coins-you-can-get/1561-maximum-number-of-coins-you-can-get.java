class Solution {
    public int maxCoins(int[] piles) {
 Arrays.sort(piles);  //[1,2,2,4,7,8] [1,2,3,4,5,6,7,8,9]
        int sum=0;
        int n=piles.length;
        for(int i=n/3;i<n;i+=2){
            sum+=piles[i];
        }
        return sum;
    }
}