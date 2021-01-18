/**
    Given an array of integer, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one soluction, and you may not use the same element twice.
    Example: 
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */

import java.util.Map;
import java.util.HashMap;

public class Solution3 { 

    public static void main(String[]args) {
        int [] nums = new int [4];

        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;        

        for(Integer i: twoSum(nums, 9)){
            System.out.println(i);
        }
        
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}