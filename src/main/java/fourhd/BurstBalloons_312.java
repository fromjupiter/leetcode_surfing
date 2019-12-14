package fourhd;

/**
 * Created by Kexiang on 2019/12/8.
 */
public class BurstBalloons_312 {

    public int maxCoins(int[] nums) {
        int len = nums.length + 2;
        int temp[] = new int[len];
        System.arraycopy(nums, 0, temp, 1, nums.length);
        nums = temp;
        nums[0] = 1; nums[len - 1] = 1;
        int dp[][] = new int[len][len];
        //dimension here means the length (end-begin+1) considered in current loop
        for (int dimensions = 3; dimensions <= len; dimensions++) { // dp dimensions
            for (int begin = 0; begin <= len - dimensions; begin++) { //begin index
                int end = begin + dimensions - 1; //end index
                for (int l = begin + 1; l < end; l++) { // last burst Balloon in current dp
                    dp[begin][end] = Math.max(dp[begin][end], dp[begin][l] + dp[l][end] + nums[begin] * nums[l] * nums[end]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
