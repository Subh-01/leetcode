class Solution {
    public int numberOfBeams(String[] bank) {
        if(bank.length<2) return 0;
        int ans=0,curr=0,prev=0;
        
        for(String row: bank){
            curr=0;
            for(char ch:row.toCharArray()){
                if(ch=='1')
                    curr++;
            }
            ans+= curr*prev;
            prev= curr==0?prev:curr;
        }
        return ans;
    }
}