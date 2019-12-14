package threehd;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        //zero count
        int zc=0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                if(zc!=0) nums[i-zc] = nums[i];
            } else {
                ++zc;
            }
        }
        for(int i=nums.length-zc;i<nums.length;++i){
            nums[i] = 0;
        }
    }
}
