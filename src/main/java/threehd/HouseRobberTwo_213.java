package threehd;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class HouseRobberTwo_213 {
    /**
     * //do not rob last house
     * dp[i] = max(dp[i+1], dp[i+2]+nums[i])
     * //rob last house
     */
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];
        //do not rob last house
        dp[nums.length - 1] = 0;
        dp[nums.length - 2] = nums[nums.length - 2];
        for (int i = nums.length - 3; i >= 0; --i)
                dp[i] = Math.max(dp[i + 1], dp[i + 2] + nums[i]);
        //rob last house
        dp[nums.length - 1] = nums[nums.length - 1];
        dp[nums.length - 2] = nums[nums.length-1];
        for (int i = nums.length - 3; i > 0; --i) {
            dp[i] = Math.max(dp[i + 1], dp[i + 2] + nums[i]);
        }
        return Math.max(dp[0],dp[1]);
    }
}
