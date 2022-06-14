import leetCode.EasyLevel.Task217DuplicatedNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuplicateNumbers {

    private final Task217DuplicatedNumbers task217DuplicatedNumbers = new Task217DuplicatedNumbers();
    private final int[] nums1 = new int[]{1, 2, 3, 1};
    private final int[] nums2 = new int[]{1, 2, 3, 4};
    private final int[] nums3 = new int[]{1,1,1,1,1,1, 2, 3,3,3,3, 4};

    @Test
    public void getDuplicateNumbers(){
        assertEquals(true, task217DuplicatedNumbers.containsDuplicate(nums1));
    }

    @Test
    public void getFalseBecauseNumbersIsNotDuplicated(){
        assertEquals(false, task217DuplicatedNumbers.containsDuplicate(nums2));
    }

    @Test
    public void getDuplicateInArrays(){
        assertEquals(true, task217DuplicatedNumbers.containsDuplicate(nums3));
    }

}
