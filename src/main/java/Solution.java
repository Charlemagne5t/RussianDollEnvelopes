import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, Comparator.comparingInt((int[] a) -> a[0])
                .thenComparingInt((int[] a) -> -a[1]));

        int[] tails = new int[envelopes.length];
        int size = 0;
        for (int[] x : envelopes) {
            int left = 0;
            int right = size;
            while (left != right) {
                int m = left + (right - left) / 2;
                if (tails[m] < x[1])
                    left = m + 1;
                else
                    right = m;
            }
            tails[left] = x[1];
            if (left == size)
                ++size;
        }
        return size;
    }
}
