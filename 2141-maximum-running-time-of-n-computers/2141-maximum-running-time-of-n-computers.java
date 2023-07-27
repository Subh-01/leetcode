class Solution {
    public long maxRunTime(int n, int[] batry) {
        long l=1;
        long h=Arrays.stream(batry).asLongStream().sum()/n;
        while(l<h){
            long m=(l+h+1)/2;
            long time=0;
            for(int t:batry)
                time+=Math.min((long)t,m);
            
             if(m*n <= time) l = m;
            else h = m-1;
        }
        return l;
    }
}