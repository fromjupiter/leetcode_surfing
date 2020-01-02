package fourhd;


public class WiggleSubsequence_376 {
    //greedy
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;

        int prev = nums[1] - nums[0];
        int count = prev==0? 1 : 2;
        for(int i=2;i<nums.length;++i) {
            int curr = nums[i] - nums[i-1];
            //different sign
            if((curr>0 && prev<=0)||(curr<0 && prev>=0)) {
                ++count;
                prev = curr;
            }
        }
        return count;
    }
    /**
     * two dp array: up, down
     */
    public int wiggleMaxLength_dp(int[] nums) {
        if(nums.length==0) return 0;

        //max len if keep current num
        int[] up = new int[nums.length+1];
        //previous num if remove current num
        int[] down = new int[nums.length+1];

        up[0] = 1;
        down[0] = 1;

        for(int i=1;i<nums.length;++i) {
            if(nums[i]<nums[i-1]) {
                up[i] = up[i-1];
                down[i] = up[i-1]+1;
            } else if (nums[i]>nums[i-1]) {
                up[i] = down[i-1]+1;
                down[i] = down[i-1];
            } else {
                up[i] = up[i-1];
                down[i] = down[i-1];
            }
        }
        return Math.max(up[nums.length-1], down[nums.length-1]);
    }
}
