package leetCode.EasyLevel;
/**
 * Поиск отсутствующего числа в массиве
 * Используя формулу суммы арифмитической прогрессии вычитая с суммой переданного массива,
 * можно найти отсутствующее число
 * O(N)
 * */
public class Task268MissingNumbers {
    public int getMissingNumbers(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i : nums) {
            sum+=i;
        }

        return n*(n+1)/2 - sum;
    }
}
