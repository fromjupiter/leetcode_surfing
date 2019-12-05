package threehd;

import java.util.PriorityQueue;

/**
 * Created by Kexiang on 2019/12/3.
 */
public class KthLargest_215 {
    public int findKthLargest(int[] nums, int k) {
        // min heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for(int num: nums) {
            if(queue.size()==k && num<queue.peek()) continue;
            else {
                queue.add(num);
                if(queue.size()>k) {
                    queue.poll();
                }
            }
        }
        return queue.peek();
    }
}
