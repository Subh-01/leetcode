class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<>();
for(int i=0;i<r.length;i++){
    res.add(check(nums,l[i],r[i]));   
}
return res;                       //l=2,r=5  nums[5,9,3,7]
    }
        public boolean check(int[] nums, int l,int r){
         int art[]=new int[r-l+1];
         int idx=0;
        for(int j=l;j<=r;j++){    //j=2 to 5
            art[idx++]=nums[j];
            }
            Arrays.sort(art);
             int d=art[1]-art[0];
            for(int i=0;i+1<art.length;i++){
 if(art[i+1]-art[i]!=d) return false;
         }
        return true;
    }
}