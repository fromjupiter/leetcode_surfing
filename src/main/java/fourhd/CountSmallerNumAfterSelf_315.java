package fourhd;

import java.util.Arrays;
import java.util.List;


public class CountSmallerNumAfterSelf_315 {
    int[] index;

    /**
     * Side effect exists! We do a in-place merge sort at nums
     * If we use regular merge sort, run time will be much less.
     */
    public List<Integer> countSmaller(int[] nums) {
//        List<Integer> temp = new LinkedList<>();
        Integer[] count = new Integer[nums.length];
        index = new int[nums.length];
        for(int i=0;i<nums.length;++i) {
            index[i] = i;
            count[i] = 0;
        }
        mergeSort(nums, count, 0, nums.length-1);
//        for(int i=nums.length-1;i>=0;--i) {
//            count[i] = insert(temp, nums[i]);
//        }
        return Arrays.asList(count);
    }

    private void mergeSort(int[] nums, Integer[] count, int start, int end) {
        if(start>=end) return;
        int mid = start + (end-start)/2;
        mergeSort(nums, count, start, mid);
        mergeSort(nums, count, mid+1, end);
        merge(nums, count, start, end);
    }

    private void merge(int[] nums, Integer[] count, int start, int end) {
        int mid = start + (end-start)/2;
        int l = start, r = mid+1;
        //update count
        while(l<=mid && r<=end) {
            if(nums[l] > nums[r]) {
                count[index[l]] = count[index[l]] + end - r + 1;
                ++l;
            } else {
                ++r;
            }
        }
        //merge
        l = start; r = mid+1;
        while(l<=mid && r<=end) {
            if(nums[l] > nums[r]) {
                ++l; continue;
            }
            int temp1 = nums[r];
            int temp2 = index[r];
            int ind = r;
            while(ind != l) {
                nums[ind] = nums[ind - 1];
                index[ind] = index[ind - 1];
                --ind;
            }
            nums[l] = temp1;
            index[l] = temp2;
            ++l;
            ++r;
            ++mid;
        }
    }

    /*
        insert sort causes TLE
     */
    private int insert(List<Integer> ls, int num) {
        if(ls.isEmpty()) {
            ls.add(num);
            return 0;
        }
        int i = 0;
        while(i<ls.size()) {
            if(ls.get(i) >= num) {
                break;
            }
            ++i;
        }
        ls.add(i, num);
        return i;
    }
}
