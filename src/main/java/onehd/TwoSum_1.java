package onehd;


import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    /*
        use hash map
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                //found the pair
                return new int[]{map.get(x), i};
            } else map.put(nums[i], i);
        }
        //we assume there is always a solution
        return null;
    }

}
