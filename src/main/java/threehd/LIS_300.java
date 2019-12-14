package threehd;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class LIS_300 {
    public int lengthOfLIS(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length;++i) {
            if(arr.isEmpty() || arr.get(arr.size()-1) < nums[i]) {
                arr.add(nums[i]);
            } else {
                int j=0;
                while(arr.get(j)<nums[i]) ++j;
                arr.set(j, nums[i]);
            }
        }
        return arr.size();
    }
}
