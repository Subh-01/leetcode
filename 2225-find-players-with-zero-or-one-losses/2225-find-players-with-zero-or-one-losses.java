class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> mapW=new HashMap<>();
          HashMap<Integer,Integer> mapL=new HashMap<>();
        
        for(int arr[]:matches){
            mapW.put(arr[0],mapW.getOrDefault(arr[0],0)+1);
            mapL.put(arr[1],mapL.getOrDefault(arr[1],0)+1);
           
        }
        List<Integer> res0=new ArrayList<>();
        List<Integer> res1=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> e:mapL.entrySet()){
            if(e.getValue()==1)
                res1.add(e.getKey());
        }
        for(Map.Entry<Integer,Integer> e:mapW.entrySet()){
             if(mapL.containsKey(e.getKey())==false)
                res0.add(e.getKey());
        }
        List<List<Integer>> res=new ArrayList<>();
        Collections.sort(res0);
        Collections.sort(res1);
        res.add(res0);
        res.add(res1);
        
        return res;
    }
}