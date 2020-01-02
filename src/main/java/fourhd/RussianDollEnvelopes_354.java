package fourhd;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Similar to LIS
 */
public class RussianDollEnvelopes_354 {

    /*
        Using reverseOrder() is important:
        say the queue is [(3,4)], if the next two are in order (5,2) (5,7);
        we first replace (3,4) with (5,2) and get [(5,2)], then (5,7) is discarded.
        If we use reverseOrder(), we will get [(5,2),(5,7)] as we expect.
     */
    Comparator<int[]> comparator = Comparator.comparing((int[] arr)->arr[0])
            .thenComparing((int[] arr)->arr[1], Comparator.reverseOrder());

    /*
        sort by width and apply LIS w.r.t. height
     */
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes==null || envelopes.length==0) return 0;
        if(envelopes.length==1) return 1;

        Arrays.sort(envelopes, comparator);
        return lis(envelopes);
    }

    /**
     * O(nlogn) using binary search
     */
    private int lis(int[][] envelopes) {
        List<int[]> arr = new ArrayList<>();
        arr.add(envelopes[0]);
        for(int i=1;i<envelopes.length;++i) {
            if(arr.get(arr.size()-1)[0]>envelopes[i][0]
                    || arr.get(arr.size()-1)[1]==envelopes[i][1]) {
                continue;
            }
            if(arr.get(arr.size()-1)[0]<envelopes[i][0] && arr.get(arr.size()-1)[1]<envelopes[i][1]) {
                arr.add(envelopes[i]);
                continue;
            }
            //find j where env[j-1] fit to env[i] but env[j] doesn't
            int j = binarySearch(arr, envelopes[i]);
            arr.set(j, envelopes[i]);
        }
        return arr.size();
    }

    private int binarySearch(List<int[]> arr, int[] target) {
        int start=0, end = arr.size()-1;
        while(start<=end) {
            int mid = (end+start)/2;
            if(arr.get(mid)[1]>=target[1] && (mid==0 || arr.get(mid-1)[1]<target[1])) {
                return mid;
            } else if(arr.get(mid)[1]>target[1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int lis_naive(int[][] envelopes) {
        int[] dp = new int[envelopes.length];
        int max = 1;
        for(int i=envelopes.length-1;i>=0;--i) {
            dp[i] = 1;
            for(int j=i+1;j<envelopes.length;++j) {
                if(envelopes[i][0]<envelopes[j][0] && envelopes[i][1]<envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
