class Solution {
    public int bestClosingTime(String customers) {
        int max=0,currP=0,bestT=-1;    //-1 taken as if no one come then it shold be 0 by+1
        for(int i=0;i<customers.length();i++){
            currP+=customers.charAt(i)=='Y'?1:-1;
            if(currP>max){
                max=currP;
                bestT=i;
            }
        }
        return bestT+1;
    }
}