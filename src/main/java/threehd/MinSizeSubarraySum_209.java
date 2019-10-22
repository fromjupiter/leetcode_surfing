package threehd;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class MinSizeSubarraySum_209 {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length==1) return nums[0]>=s?1:0;
        int res = Integer.MAX_VALUE;
        int i=0,j=1;
        int sum=nums[0];
        while(i<nums.length) {
            while(sum<s && j<nums.length){
                sum+=nums[j];
                ++j;
            }
            if(sum>=s){
                res = Math.min(res, j-i);
            }
            sum-=nums[i];
            ++i;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
