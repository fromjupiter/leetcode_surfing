package threehd;

/**
 * Created by Kexiang on 2019/12/4.
 */
public class ProductOfArrayExceptSelf_238 {
    /**
     * first init res to left products except self
     * then update from right, by storing a "right product except self"
     */
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=1;
        for(int i=1;i<res.length;++i){
            res[i] = res[i-1]*nums[i-1];
        }
        int rp = 1;
        for(int i=res.length-2;i>=0;--i){
            rp *= nums[i+1];
            res[i] *= rp;
        }
        return res;
    }
}
