package leetCode.EasyLevel;

import leetCode.EasyLevel.Task1TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTwoSum {
    private final Task1TwoSum task1TwoSum = new Task1TwoSum();
    int[] nums1 = new int[]{2, 17, 11, 15};
    int[] nums2 = new int[]{2, 7, 11, 15};

    @Test
    public void getEmptyArraysFromGivenArrays() {
        int[] nums = task1TwoSum.twoSum(nums1, 9);
        int[] emptyArrays = new int[]{};
        assertArrayEquals(emptyArrays, nums);
    }

    @Test
    public void getTwoNumbersInArraysWhichSumIsTargetNumber() {
        int[] nums = task1TwoSum.twoSum(nums2, 9);
        int[] indexesOfNumWhichSumIsTarget = new int[]{0,1};
        assertArrayEquals(indexesOfNumWhichSumIsTarget, nums);
    }

    @Test
    public void getEmptyArraysFromGivenArraysByMap() {
        int[] nums = task1TwoSum.twoSumUsingMap(nums1, 9);
        int[] emptyArrays = new int[]{};
        assertArrayEquals(emptyArrays, nums);
    }

    @Test
    public void getTwoNumbersInArraysWhichSumIsTargetNumberByMap() {
        int[] nums = task1TwoSum.twoSumUsingMap(nums2, 9);
        int[] indexesOfNumWhichSumIsTarget = new int[]{0,1};
        assertArrayEquals(indexesOfNumWhichSumIsTarget, nums);
    }
}
