/**
 * Given a 32-bit signed integr reverse digits of an integer.
 * 
 * Example 1:
 * Input: 123
 * Output: 321
 * 
 * Example 2: 
 * Input: -123
 * output: -321
 * 
 * Example 3:
 * Input: 120
 * Output: 21
 * 
 * Note: Assume we are dealing with a environment which could only store integer within the 32 bit signed integer range: [-231, 231 -1].
 * For the purporse of this problem, asuume the your function return 0 when reversed integer overflows.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse (int number) {
        long out = 0; // Result might overflow

        while(number != 0) {
            out = out * 10 + number % 10; // app last digit of number
            number = number / 10; //remove last digit
        }

        if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) return 0;

        return (int) out;
    }
    
}
