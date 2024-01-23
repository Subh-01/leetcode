class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result += value * Math.pow(26, columnTitle.length() - 1 - i);
        }

        return result;
    }
}