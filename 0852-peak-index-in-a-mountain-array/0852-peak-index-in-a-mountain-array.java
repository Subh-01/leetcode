class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=0;
        for(int i=1;i+1<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
                ans=Math.max(ans,i);
        }
        return ans;
    }
}