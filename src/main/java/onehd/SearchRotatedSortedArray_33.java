package onehd;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class SearchRotatedSortedArray_33 {
    /**
     * We can use binary search first to find the rotation point,
     * Then we can do normal binary search on left side or right side
     */
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        if(nums.length==1) return nums[0]==target?0:-1;
        if(nums[0]<nums[nums.length-1]) return binarySearch(nums, 0, nums.length-1, target);

        int pivot = findPivot(nums);
        if(target==nums[0]) return 0;
        if(target>nums[0]) return binarySearch(nums, 0, pivot, target);
        else return binarySearch(nums, pivot+1, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        while(start<=end){
            int mid = (end+start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = (end+start)/2;
            if(nums[mid]>nums[mid+1]) return mid;
            if(nums[start]<nums[mid]) start = mid;
            else end = mid;
        }
        return -1;
    }
}
