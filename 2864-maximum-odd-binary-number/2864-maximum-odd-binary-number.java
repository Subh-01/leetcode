class Solution {
    public String maximumOddBinaryNumber(String s) {
 // Sort the string in descending order
char[] charArray = s.toCharArray();
Arrays.sort(charArray);
String sortedString = new StringBuilder(new String(charArray)).reverse().toString();

// Check if the first character is '1'
if (sortedString.charAt(0) == '1') {
    sortedString = sortedString.substring(1);  // Remove the first character '1'
    sortedString += '1';  // Append '1' to the end of the string
}

return sortedString;   
    }
}