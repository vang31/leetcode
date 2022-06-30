package leetCode.EasyLevel;

public class Task338CountingsBits {

    public int[] getCountBits(int n) {
        int[] memo = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            memo[i] = memo[i >> 1] + i%2;
        }

        return memo;
    }
}
