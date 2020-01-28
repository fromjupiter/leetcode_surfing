package fivehd;

import java.util.Arrays;
import java.util.Comparator;


public class NonOverlapIntervals_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, Comparator.comparing(x->((int[])x)[0]));
        int count = 1;
        int[] curr = intervals[0];
        int i=1;
        while(i<intervals.length) {
            if(curr[0]==intervals[i][0]) {
                curr[1] = Math.min(curr[1], intervals[i][1]);
            } else {
                if(curr[1] <= intervals[i][0]) {
                    count++;
                    curr = intervals[i];
                } else {
                    curr = curr[1]<intervals[i][1] ? curr : intervals[i];
                }
            }
            ++i;
        }
        return intervals.length - count;
    }
}
