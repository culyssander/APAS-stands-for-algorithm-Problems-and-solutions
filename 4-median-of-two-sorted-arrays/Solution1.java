/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 
 * You may assume nums1 and nums2 cannot be both empty.
 * 
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * 
 * Example 2: 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3) / 2 = 2.5
 */

 public class Solution1 {

    public static void main(String [] args) {

        int []nums1 = {1, 2};
        int [] nums2 = {3, 4};

        double media = findMedianSortedArrays(nums1, nums2);

        System.out.println(String.format("The media is %.1f", media));
    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        System.out.println(m);
        System.out.println(n);

        if(m > n) {
            int [] temp = a; a = b; b = temp;
            int tmp = m; m = n; n = tmp;
        }

        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;

        while(iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;

            if(i < iMax && b[j-1] > a[i]) {
                iMin = i + 1; // i is too small
            } else if(i > iMin && a[i-1] < b[j]) {
                iMax = i -1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if(i == 0) { maxLeft = b[j-1]; }
                else if(j == 0) { maxLeft = a[i - 1]; }
                else { maxLeft = Math.max(a[i-1], b[j-1]); }
                if( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if(i == m) { minRight = b[j]; }
                else if( j == n ) { minRight = a[i]; }
                else  { minRight = Math.min(b[j], a[i]); }
                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0;
    }
 }
