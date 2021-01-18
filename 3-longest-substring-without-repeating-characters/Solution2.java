/**
 * Given a strong, find the length of the longet substring without repeating characters.
 * 
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3
 * 
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1
 * 
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3
 * 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Solution2 {

    static char[] index = new char[128];

    public static void main(String[]args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length(), ans = 0;

        for(int i=0; i<n; i++) {
            
            if(!contains(s.charAt(i))) {
                index[i] = s.charAt(i);
                ans++;
            }
        }

        return ans;
    }

    private static boolean contains(char c) {
        for(int i = 0; i < index.length; i++) {
            if(index[i] == c) return true;
        }
        return false;
    }
}
