class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int res[]=new int[k];
        int[][] strength = new int[mat.length][2];
for (int i = 0; i < mat.length; i++) {
    int sum = 0;
    for (int j = 0; j < mat[i].length; j++) {
        sum += mat[i][j];
    }
    strength[i][0] = sum;
    strength[i][1]= i;
}

        Arrays.sort(strength,(a,b) -> a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
 for (int i = 0; i < k; ++i) {
            res[i] = strength[i][1];
        }
return res;
    }
}