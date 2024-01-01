class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,i=0;
        while(c<g.length && i<s.length){
            if(g[c]<=s[i]){
                c++;
                i++;
            }else i++;
        }
        return c;
    }
}