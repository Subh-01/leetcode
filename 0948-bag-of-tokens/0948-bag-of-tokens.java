class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length-1;
        int score = 0;
        while( i <= j ){
            if( tokens[i] <= power) {
                score++;
                power -= tokens[i++];
            }
            else if ( score >= 1 && i<j ){   //i<j to handle case where first less than power;
                score--;
                power += tokens[j--];
            }
            else break;
        }
        return score;
    }
}