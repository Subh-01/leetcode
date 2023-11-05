class Solution {
    public int getWinner(int[] arr, int k) {
        int curr=arr[0],winc=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>curr){
                curr=arr[i];
                winc=0;
            }
            winc++;
            if(winc==k) break;
        }
        return curr;
    }
}