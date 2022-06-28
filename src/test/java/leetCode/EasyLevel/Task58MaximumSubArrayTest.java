package leetCode.EasyLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task58MaximumSubArrayTest {

    private final Task58MaximumSubArray msa = new Task58MaximumSubArray();
    private final int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    private final int[] nums2 = new int[]{5,4,-1,7,8};
    private final int[] nums3 = new int[]{1};

    @Test
    void getMaxSubArray() {
        assertEquals(6, msa.getMaxSubArray(nums1));
    }

    @Test
    void getMaxSubArray23() {
        assertEquals(23, msa.getMaxSubArray(nums2));
    }

    @Test
    void getMaxSubArray1() {
        assertEquals(1, msa.getMaxSubArray(nums3));
    }
}