package fivehd;

public class SplitArrayLargestSum_410 {
    /**
     * binary search
     */
    // minimize largest sum
    public int splitArray(int[] nums, int m) {
        long l=0, r=0;
        for(int n:nums) {
            l = Math.max(l, n);
            r+=n;
        }
        while(l<r) {
            //take mid as the max sum
            long mid = l + (r-l)/2;
            int split = 1, curr=0;
            for(int n:nums) {
                if(curr+n > mid) {
                    split++; curr=0;
                }
                curr+=n;
            }
            if(split<=m) r=mid;
            else l = mid+1;
        }
        return (int) r;
    }
}
