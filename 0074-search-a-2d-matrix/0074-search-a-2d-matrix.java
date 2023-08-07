class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int s=0,e=m*n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
                int r=mid/n;
            int c=mid%n;
            if(matrix[r][c]==target)
                return true;
            else if(matrix[r][c]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}