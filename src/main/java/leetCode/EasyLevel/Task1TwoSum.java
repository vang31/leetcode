package leetCode.EasyLevel;

import java.util.HashMap;
import java.util.Map;

/**
 * Поиск двух чисел из массива чисел, которые составляют сумму равная искомому числу.
 * решение:
 * Создать переменную которая будет указывать на длину массивва.
 * Создать два цикла i, j.
 * условие окончания цикла i будет i < arrays.length() - 1
 * условие окончания цикла j будет j < arrays.length()
 * два цикла нужны для того, чтобы создать комбинации из двух чисел массива чисел.
 * во втором цикле начало цикла начинается со значения i+1, где i это начало первого цикла.
 Для того чтобы первое значение массива 0 складывалось со следущем значнием.
 * при выполнении условия сумма двух чисел в массиве равна искомому числу передать их индекс
 * Сложность O(n^2) из-за вложенного массива.
 */
public class Task1TwoSum {

    //O(N^2)
    public int[] twoSum(int[] nums, int target) {
        int lengthOfNumArrays = nums.length;
        for (int i = 0; i < lengthOfNumArrays; i++) {
            for (int j = i + 1; j < lengthOfNumArrays; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //O(N)
    public int[] twoSumUsingMap(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int n = target - nums[i];

            if(complement.containsKey(n)) {
                return new int[]{complement.get(n), i};
            }

            complement.put(nums[i], i);
        }
        return new int[]{};
    }

    

}
