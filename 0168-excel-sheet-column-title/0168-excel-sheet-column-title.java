class Solution {
    public String convertToTitle(int cn) {
        char arr[]=new char[27];
        for(int i=1;i<27;i++){
           arr[i] = (char) ('A' + (i-1));    //store arr with A to Z
        }
        int q=cn;
       
        StringBuilder sb=new StringBuilder();
        //if(cn<27) return Character.toString(arr[cn]);
     
        while(q>0){
            int r = (q - 1) % 26;
        sb.insert(0, arr[r + 1]);
        q = (q - 1) / 26;
            
        }
        return sb.toString();
    }
}