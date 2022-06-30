package leetCode.EasyLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task338CountingsBitsTest {

    private final Task338CountingsBits countingBits = new Task338CountingsBits();
    private int n1 = 2;
    private int n2 = 5;

    @Test
    void getCountBits() {
        int[] countBits =  countingBits.getCountBits(n1);
        int[] waitResult = new int[]{0, 1 , 1};
        assertArrayEquals(waitResult, countBits);
    }

    @Test
    void getCountBitsOfNumberFive() {
        int[] countBits =  countingBits.getCountBits(n2);
        int[] waitResult = new int[]{0,1,1,2,1,2};
        assertArrayEquals(waitResult, countBits);
    }
}