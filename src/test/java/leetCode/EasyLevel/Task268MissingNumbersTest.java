package leetCode.EasyLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task268MissingNumbersTest {
    private final int[] test1 = new int[]{0,1,3};
    private final int[] test2 = new int[]{0,1,2,5,6,4,7,8,9};
    private final int[] test3 = new int[]{0,1,2,3,5};

    private Task268MissingNumbers task = new Task268MissingNumbers();

    @Test
    void getMissingNumbers2() {
        assertEquals(2, task.getMissingNumbers(test1));
    }
    @Test
    void getMissingNumbers3() {
        assertEquals(3, task.getMissingNumbers(test2));
    }
    @Test
    void getMissingNumbers4() {
        assertEquals(4, task.getMissingNumbers(test3));
    }
}