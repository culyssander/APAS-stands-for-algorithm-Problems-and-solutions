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
