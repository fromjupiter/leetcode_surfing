package fourhd;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class IncreasingTriplet_334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int i=0;
        while(i<nums.length-2 && nums[i] >= nums[i+1]) {
            ++i;
        }
        if(i==nums.length-2) return false;

        int iVal = nums[i], jVal = nums[i+1];
        int k = i+2;
        int iNext = Integer.MAX_VALUE;
        while(k<nums.length) {
            if(nums[k] > jVal) return true;

            if(nums[k] > iVal) {
                //update j value
                jVal = nums[k];
                //update i to smallest possible value
                if(iNext != Integer.MAX_VALUE) {
                    iVal = iNext;
                    iNext = Integer.MAX_VALUE;
                }
            } else {
                if(iNext < nums[k]) {
                    //update i,j together
                    iVal = iNext;
                    jVal = nums[k];
                    iNext = Integer.MAX_VALUE;
                } else iNext = nums[k];
            }
            ++k;
        }
        return false;
    }

    /**
     * Similar idea, but much simpler
     */
    public boolean increasingTriplet_others(int[] nums) {
        if (nums.length <3) return false;


        int smaller_1 = Integer.MAX_VALUE;
        int smaller_2 = Integer.MAX_VALUE;
        int largest = -1;
        for (int i = 0; i<nums.length;++i) {
            largest = nums[i];
            if (largest <= smaller_1 ) {
                smaller_1 = largest;
            }
            else if (largest <= smaller_2 ) {
                smaller_2 = largest;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
