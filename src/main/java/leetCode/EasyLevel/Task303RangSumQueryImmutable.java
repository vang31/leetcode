package leetCode.EasyLevel;

public class Task303RangSumQueryImmutable {

    private int[] arr;

    public Task303RangSumQueryImmutable(int[] nums){
        arr = new int[nums.length];
        arr[0] = nums[0];

        for ( int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
    }


    public int SumArrays(int left, int right) {
        if(left == 0)
        return arr[right];

        return arr[right] - arr[left - 1];
    }
}
