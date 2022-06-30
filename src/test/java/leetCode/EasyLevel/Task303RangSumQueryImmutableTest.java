package leetCode.EasyLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task303RangSumQueryImmutableTest {

    private final int[] nums = new int[]{-2,0,3,-5,2,-1};
    private final Task303RangSumQueryImmutable task303 = new Task303RangSumQueryImmutable(nums);


    @Test
    void get1OfSumArrays() {
        int res1 =  task303.SumArrays(0, 2);
        assertEquals(1, res1);



        int res3 = task303.SumArrays(0, 5);
        assertEquals(-3, res3);
    }

    @Test
    void getMinusOneOfSumArrays() {
        int res2 = task303.SumArrays(2, 5);
        assertEquals(-1, res2);
    }

    @Test
    void getMinusThreeOfSumArrays() {
        int res2 = task303.SumArrays(2, 5);
        assertEquals(-1, res2);
    }

}