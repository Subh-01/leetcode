class Solution {
    public int countNicePairs(int[] nums) {
        int res=0, mod=(int)1e9 + 7;
        Map<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            int rev=reverse(n);
            int f=count.getOrDefault(n-rev,0);
            count.put(n-rev, f+1);
            res=(res+f)%mod;
        }
        return res;
    }
    int reverse(int n){
 int rev=0;
        while(n>0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }
}


/*A[i] + rev(A[j]) == A[j] + rev(A[i])
A[i] - rev(A[i]) == A[j] - rev(A[j])
B[i] = A[i] - rev(A[i])

Then it becomes an easy question that,
how many pairs in B with B[i] == B[j] */