package onehd;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class FindFirstAndLast_34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int pos = binarySearch(nums, 0, nums.length-1, target);
        if(pos==-1) return new int[]{-1,-1};
        int start = pos, end = pos;
        while(start>=0 && nums[start]==target) --start;
        while(end<nums.length && nums[end]==target) ++end;

        return new int[]{start+1, end-1};
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        while (start<=end) {
            int mid = (end+start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
