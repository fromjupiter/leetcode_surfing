package onehd;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class JumpGameTwo_45 {
    /**
     * greedy with O(1) space
     */
    public int jump_v0(int[] nums) {
        int stepCount = 0;
        int endStep = nums.length-1;
        while (endStep>0){
            int lastPossibleStep = endStep;
            int i = 0;
            for(;i<endStep;++i){
                if(i+nums[i]>=endStep) {
                    lastPossibleStep = i;break;
                }
            }
            if(lastPossibleStep==endStep) return -1;
            endStep = lastPossibleStep;
            ++stepCount;
        }
        return stepCount;
    }

    /**
     * improved greedy: find the next step which achieves longest distance
     */
    public int jump(int[] nums) {
        if(nums.length<2) return 0;
        int stepCount = 1;
        int endStep = nums.length-1;
        int curr = 0;
        while (curr+nums[curr]<nums.length - 1){
            int maxDis = 0;
            int nextStep = curr;
            for(int i=1;i<=nums[curr];++i){
                if(curr+i+nums[curr+i]>maxDis) {
                    maxDis = curr+i+nums[curr+i];
                    nextStep = curr+i;
                }
            }
            curr = nextStep;
            ++stepCount;
        }

        return stepCount;
    }
}
