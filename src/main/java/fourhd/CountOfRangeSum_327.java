package fourhd;


public class CountOfRangeSum_327 {
    /**
     * Use merge sort on a sum array:
     * sum[i] = sum(nums[0:i])
     * therefore, range(i, j) = sum[j] - sum[i]
     */
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sum = new long[nums.length+1];
        sum[0] = 0;
        for(int i=1;i<sum.length;++i) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        return mergeSort(sum, 0, nums.length, lower, upper);
    }

    private int mergeSort(long[] nums, int start, int end, int lower, int upper) {
        if(start>=end) return 0;
        int mid = start+(end-start)/2;
        int count = 0;
        count += mergeSort(nums, start, mid, lower, upper);
        count += mergeSort(nums, mid+1, end, lower, upper);
        //sliding window
        //any range starts at i and ends between [j,k) will satisfy the condition
        for(int i=start, j=mid+1,k=mid+1;i<=mid;++i) {
            while(j<=end && nums[j]-nums[i] < lower) j++;
            while(k<=end && nums[k]-nums[i] <= upper) k++;
            count += (k-j);
        }
        mergeTwo(nums, start, end);
        return count;
    }

    private void mergeTwo(long[] nums, int start, int end) {
        int mid = start+(end-start)/2;
        long[] left = new long[mid-start+1];
        long[] right = new long[end-mid];
        for(int i=start;i<=mid;++i) {
            left[i-start] = nums[i];
        }
        for(int i=mid+1;i<=end;++i) {
            right[i-mid-1] = nums[i];
        }
        int l=0, r=0;
        for(int i=start;i<=end;++i) {
            if (l < left.length && r < right.length) {
                if (left[l] <= right[r]) {
                    nums[i] = left[l++];
                } else {
                    nums[i] = right[r++];
                }
            } else if (l < left.length) {
                nums[i] = left[l++];
            } else {
                nums[i] = right[r++];
            }
        }
    }
}
