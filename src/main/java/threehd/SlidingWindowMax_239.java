package threehd;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Created by Kexiang on 2019/12/4.
 */
public class SlidingWindowMax_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return nums;

        int[] ans = new int[nums.length - k + 1];

        //The values in this queue is monotonically decreasing
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (q.size() > 0 && nums[i] >= nums[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
            if (i - k + 1 >= 0) ans[i - k + 1] = nums[q.getFirst()];

            if (i - k + 1 == q.getFirst()) q.removeFirst();
        }

        return ans;
    }
}
