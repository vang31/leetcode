package leetCode.EasyLevel;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Сложность О(n)
 * Создаем хэшсет чтобы хранить массив чисел, не сохраняя дубликаты.
 * если число не добавилось в сет, значит он уже присутствует там.
 * тогда возвращаем тру. иначе фолс.
 */

public class Task217DuplicatedNumbers {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> numsWithOutDuplicate = new HashSet<>();

        for(int i: nums){
            if(!numsWithOutDuplicate.add(i)){
                return true;
            }
        }
        return false;
    }
}
