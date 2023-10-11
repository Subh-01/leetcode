class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
         List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        
        for(int arr[]:flowers){
  start.add(arr[0]);
            end.add(arr[1]);
        }
        start.sort(Integer::compare);
        end.sort(Integer::compare);
        
          List<Integer> res = new ArrayList<>();
        for(int t:people){
            int st=upper_bound(start,t);
            int en=lower_bound(end,t);
            res.add(st-en);
        }
        int ans[]=new int[res.size()];
        int i=0;
        for(int a:res)    
            ans[i++]=a;   
        
        return ans;
    }
    int lower_bound(List<Integer> ls,int target){
        int l=0,r=ls.size();
        while(l<r){
            int m=l+(r-l)/2;
            if(ls.get(m)<target)
                l=m+1;
            else r=m;
        }
        return l;
    }
     int upper_bound(List<Integer> ls,int target){
        int l=0,r=ls.size();
        while(l<r){
            int m=l+(r-l)/2;
            if(ls.get(m)<=target)
                l=m+1;
            else r=m;
        }
        return l;
    }
}