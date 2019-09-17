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
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        int firstPositive = 0;
        while(firstPositive < nums.length){
            if(nums[firstPositive]>0) break;
        }

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
}
