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

import java.util.*;

public class Solution1 {

    public static void main(String[]args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0, j= 0; i<n; i++) {

            if(map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }

            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }

        return ans;
    }
}
