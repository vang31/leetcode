package leetCode.EasyLevel;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * */

// O(n) time | O(1) space
public class Task58MaximumSubArray {

    public int getMaxSubArray(int[] nums) {
        int currentSum = nums[0];
        int resultSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSum = Math.max(num, currentSum+num);
            resultSum = Math.max(resultSum, currentSum);
        }

        return resultSum;
    }

}
