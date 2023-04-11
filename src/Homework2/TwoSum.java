package Homework2;

import java.util.Arrays;

/* Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target. You may assume that each input would have exactly one
solution, and you may not use the same element twice.
You can return the answer in any order. */
public class TwoSum {
    public static int[] istwoSum( int[] nums, int target ) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main( String[] args ) {
        int[] nums = {86, 9, 1, 0, -3, -4, 10, 44};
        int target = -7;
        System.out.println(Arrays.toString(istwoSum(nums, target)));
    }
}