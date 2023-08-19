class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        Arrays.sort(arr2);
        int n=arr2.length;
        for(int i=0;i<arr1.length;i++){
            int x=0;
            for(int j=0;j<n;j++){
            int diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<=d)
                    break;
            else x++;   
                }
         if(x==n) c++;
        }
        return c;
    }
}