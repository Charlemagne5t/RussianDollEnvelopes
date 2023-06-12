import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxEnvelopesTest1() {
        int[][] envelopes = {
                {5, 4},
                {6, 4},
                {6, 7},
                {2, 3}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().maxEnvelopes(envelopes));
    }

    @Test
    public void maxEnvelopesTest2() {
        int[][] envelopes = {
                {1, 1},
                {1, 1},
                {1, 1}
        };
        int output = 1;
        Assert.assertEquals(output, new Solution().maxEnvelopes(envelopes));
    }

}
