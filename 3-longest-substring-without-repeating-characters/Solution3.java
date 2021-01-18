import java.util.*;

public class Solution3 {

    public static void main(String[]args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Set<Character> set = new HashSet<Character>();

        int ans = 0, i = 0, j = 0;

        while(i < n && j < n) {

            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }else {
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }
}
