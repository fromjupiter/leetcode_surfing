package onehd;

import java.util.*;

/**
 * Created by Kexiang on 2019/9/16.
 */
public class ThreeSum_15 {
    /**
     * Similar to Two Sum, we can use Hash to do a simple n^2 loop.
     * Result shows 28.47% speed and 65% space :(
     *
     */
    public List<List<Integer>> threeSum_v0(int[] nums) {
        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        //value->index
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;++i) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;++i) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;++j) {
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int key = -nums[i]-nums[j];
                if(map.containsKey(key) && map.get(key)>j) {
                    ans.add(Arrays.asList(nums[i],nums[j],key));
                }
            }
        }
        return ans;
    }

    /**
     * Now we look at how to optimize the code.
     * Since we cannot reduce O(n^2) to O(nlogn), so we can just cut some unnecessary check
     * Let's forget about hashing this time
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        int firstPositive = 0;
        while(firstPositive < nums.length){
            if(nums[firstPositive]>0) break;
            ++firstPositive;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<firstPositive;++i) {
            //Check duplicate solutions
            if(i>0 && nums[i]==nums[i-1]) continue;
            int twoSum = -nums[i];
            //iterate the rest
            int left = i+1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == twoSum) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    do {
                        ++left;
                    } while(left<nums.length && nums[left]==nums[left-1]);
                    do {
                        --right;
                    } while (right>0 && nums[right]==nums[right+1]);
                } else if (nums[left] + nums[right] > twoSum) {
                    --right;
                } else {
                    ++left;
                }
            }
        }
        return ans;
    }
}
