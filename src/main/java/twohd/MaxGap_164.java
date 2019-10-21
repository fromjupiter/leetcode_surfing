package twohd;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class MaxGap_164 {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int max=Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;++i) {
            if(max<nums[i]) max = nums[i];
            if(min>nums[i]) min = nums[i];
        }
        //bucket[0] is min, bucket[1] is max
        int capacity = Math.max(1, (max-min)/(nums.length-1));
        int[][] buckets = new int[(max-min)/capacity+1][2];
        for(int[] bucket:buckets) {
            bucket[0] = Integer.MAX_VALUE;
            bucket[1] = Integer.MIN_VALUE;
        }
        for(int i=0;i<nums.length;++i) {
            int ind = (nums[i] - min)/capacity;
            if(buckets[ind][0]>nums[i]) buckets[ind][0]=nums[i];
            if(buckets[ind][1]<nums[i]) buckets[ind][1]=nums[i];
        }
        int res = Integer.MIN_VALUE;
        int prevMax = min;
        for(int[] bucket:buckets){
            if(bucket[0]==Integer.MAX_VALUE) continue;
            res = Math.max(res, bucket[0] - prevMax);
            prevMax = bucket[1];
        }
        return res;
    }
}
