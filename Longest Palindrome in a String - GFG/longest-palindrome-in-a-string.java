//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        // code here
        int start=0;
       int end=s.length()-1;
       int ans=0;
       int next=0;
       String res="";
       while(start<=end){
           while(next<=end){
               if(check(next,end,s)){
                   if(ans>=(end-next+1))
                   break;

                   res=s.substring(next,end+1);
                   ans=end-next+1;
                   break;
               }
               end--;
           }
           next=start++;
           end=s.length()-1;
       } 
       return res;
    }
    public static boolean check(int start,int end,String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}