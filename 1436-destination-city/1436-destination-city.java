class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set=new HashSet<>();
        for(List<String> ls: paths){
            set.add(ls.get(0));
        }
         for(List<String> ls: paths){
            if(set.add(ls.get(1))) 
               return ls.get(1);
        }
               return "";
    }
}