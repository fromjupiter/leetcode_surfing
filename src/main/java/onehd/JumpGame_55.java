package onehd;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class JumpGame_55 {
    /**
     * greedy
     */
    public boolean canJump(int[] nums) {
        int endStep = nums.length-1;
        while (endStep>0){
            int i = endStep-1;
            for(;i>=0;--i){
                if(i+nums[i]>=endStep) {
                    endStep=i;break;
                }
            }
            if(i<0 && endStep!=0) return false;
        }
        return true;
    }
}
