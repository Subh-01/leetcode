class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans=0;
     // The one that is farthest from the left end, but desires to go in the left
        // direction, will be the last one to go off of the plank from the left side.
        for(int l:left)
            ans=Math.max(ans,l);
        
        // Similarly,
        // The one that is farthest from the right end, but desires to go in the right
        // direction, will be the last one to go off of the plank from the right side.
        for(int r:right)
            ans=Math.max(ans,n-r);
        
        // The one among above two would be the last one to off of the plank among all.
        return ans;
    }
}