class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int cnd[]=new int[n];
        Arrays.fill(cnd,1);
        
        //hanling increasing subarray
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1] && cnd[i-1]>=cnd[i]){
                cnd[i]=cnd[i-1]+1;
            }
        }
        //handling decreasing subarray
        for(int i=n-2;i>=0;i--){
            if(ratings[i+1]<ratings[i] && cnd[i+1]>=cnd[i]){
                cnd[i]=cnd[i+1]+1;
            }
        }
        
        int total=0;
        for(int x:cnd)
            total+=x;
        
        return total;
    }
}