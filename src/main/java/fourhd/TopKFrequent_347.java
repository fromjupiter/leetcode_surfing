package fourhd;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequent_347 {
    class Node {
        int num;
        int count;
        Node(int n, int c) {num=n;count=c;}
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num: nums) {
            counts.put(num, 1 + counts.getOrDefault(num, 0));
        }
        PriorityQueue<Node> heap = new PriorityQueue<>(k, Comparator.comparing(x->x.count));
        for(Map.Entry<Integer, Integer> entry:counts.entrySet()) {
            if(heap.size()==k && heap.peek().count >= entry.getValue()) {
                continue;
            }
            Node node = new Node(entry.getKey(), entry.getValue());
            heap.offer(node);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        int[] res = new int[heap.size()];
        for(int i=res.length-1;i>=0;--i) {
            res[i] = heap.poll().num;
        }
        return IntStream.of(res).boxed().collect(Collectors.toList());
    }
}
