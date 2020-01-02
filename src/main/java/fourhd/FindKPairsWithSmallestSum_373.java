package fourhd;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSum_373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>(k);
        if(nums1.length==0||nums2.length==0||k==0) return res;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->a[0]+nums2[a[1]]-b[0]-nums2[b[1]]);
        for(int i=0;i<nums1.length && i<k; ++i)
            queue.offer(new int[]{nums1[i], 0});

        while(k-->0 && !queue.isEmpty()) {
            int[] curr = queue.poll();
            res.add(Arrays.asList(curr[0], nums2[curr[1]]));
            if(curr[1]==nums2.length-1) continue;
            //try to combine with next element in nums2
            queue.offer(new int[]{curr[0], curr[1]+1});
        }

        return res;
    }
}
