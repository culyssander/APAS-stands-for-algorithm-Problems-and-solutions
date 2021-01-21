/**
 * The String "PAYPALISHIRING" is written in zigzag pattern 
 * on a given number of rows like this: (you may want to display this in fixed font for better legibility)
 * 
 * P A H N
 * APLSIIG
 * Y I R
 * 
 * and then read line by line: "PANHAPLSIIGYR"
 * 
 * Write the code that will take a string and make this conversion 
 * String convert(String s, int numRow);
 * 
 * Example 1: 
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * 
 * Builder an array of StringBuffers
 * Traverse the given string and append characters in correct StringBuffer
 * Append all other rows to first row to get output
 */

public class Solution {
    
    public static void main(String[] args) {
        String word = "PAYPALISHIRING";
        String result = convert(word, 3);

        System.out.println(result);
    }

    public static String convert(String s, int numRow) {
        StringBuffer[] sb = new StringBuffer[numRow];

        for(int i=0; i< sb.length; i++) {
            sb[i] = new StringBuffer();
        }

        int len = s.length();
        int i = 0;

        while( i < len) {
            for(int j = 0; j < numRow && i < len; j++) {
                sb[j].append(s.charAt(i++));
            }

            for(int j = numRow - 2; j > 0 && i < len; j--) {
                sb[j].append(s.charAt(i++));
            }
        }
        for(int k = 1; k < numRow; k++) {
            sb[0].append(sb[k]);
        }
        return sb[0].toString();
    }
}
