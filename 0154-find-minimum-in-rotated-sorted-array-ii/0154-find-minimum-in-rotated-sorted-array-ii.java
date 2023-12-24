class Solution {
    public int findMin(int[] num) {
        int i=0,j=num.length-1;
        while(i<j)
        {
            int mid=(i+j)/2;
            if(num[j]<num[mid]){
                i=mid+1;
            }
            else if(num[mid]<num[j]){
                j=mid;
            }
            else{//num[mid]==num[j]
                if(num[i]==num[mid]){//linear complexity
                    i++;
                    j--;
                }
                else
                    j=mid;
            }
        }
        return num[j];
    }
}