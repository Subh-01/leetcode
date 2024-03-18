class Solution {
    public int findMinArrowShots(int[][] points) {
         if(points.length==0) return 0;

        Arrays.sort(points,Comparator.comparingInt(a -> a[1]));
        int  currP=points[0][1];
        int c=1;
        for(int i=1;i<points.length;i++){
            if(currP>=points[i][0]) {continue;}
            
            c++;
            currP=points[i][1];
        }
        return c;
    }
}