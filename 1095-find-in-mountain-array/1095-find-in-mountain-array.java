/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int firsttry=orderAgnosticBS(mountainArr,target,0,peak,true);
        if(firsttry!=-1) return firsttry;
        else 
        return orderAgnosticBS(mountainArr,target,peak+1,mountainArr.length()-1,false);
    }
    public int peakIndexInMountainArray(MountainArray arr) {
        int l=0,r=arr.length()-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(arr.get(m)>arr.get(m+1))  //it means array is in descending part
            r=m-1;
            else
            l=m+1;
        }
        return l;
    }
    public int orderAgnosticBS(MountainArray arr,int target, int l,int r,boolean firstpart){
 while(l<=r){
     int m=l+(r-l)/2;
     if(arr.get(m)==target) return m;
     if(firstpart){
      if(target<arr.get(m))  
            r=m-1;
            else l=m+1;
             }
            else{
                if(target<arr.get(m)) l = m + 1;
                else r = m - 1;
            }
 }  
 return -1;     
    }
    
}