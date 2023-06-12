import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int[] dp = new int[envelopes.length];
        dp[0] = 1;
        int localMax = 1;
        int globalMax = 1;
        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    localMax = Math.max(localMax, dp[j] + 1);
                }
            }
            dp[i] = localMax;
            globalMax = Math.max(localMax, globalMax);
            localMax = 1;
        }


        return globalMax;
    }
}
