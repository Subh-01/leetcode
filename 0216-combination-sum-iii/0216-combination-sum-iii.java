class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(ans,1,k,n,new ArrayList<>());
        return ans;
    }
    public void solve(List<List<Integer>> ans,int start,int k,int n,List<Integer>tmp){
          if(n == 0 && k == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        if(k==0) return;
        for(int i=start;i<=9;i++){
            tmp.add(i);
            solve(ans,i+1,k-1,n-i,tmp);
            tmp.remove(tmp.size()-1);
            }
        
    }
}