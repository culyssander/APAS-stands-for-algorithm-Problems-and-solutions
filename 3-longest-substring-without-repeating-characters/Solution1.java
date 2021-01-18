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
