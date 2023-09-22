//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int f=-1,l=-1;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==x){
                f=m;
                e = m - 1; // Search in the left half for the further first occurrence
            } else if(arr[m]>x)
            e=m-1;
            else s=m+1;
        }
        //finding last ele;
        s=0;
        e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
             if (arr[m] == x) {
            l = m;
            s = m + 1; // Search in the right half for the last occurrence
        } else if (arr[m] > x) {
            e = m - 1;
        } else {
            s = m + 1;
        }
            
        }
     return new ArrayList<>(List.of(f, l));
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends