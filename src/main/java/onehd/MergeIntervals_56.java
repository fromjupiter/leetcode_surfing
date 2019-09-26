package onehd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(x->x[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

        for(int i=1;i<intervals.length;++i){
            int[] curr = ans.get(ans.size()-1);
            if (curr[1] < intervals[i][0]){
                ans.add(intervals[i]);
            } else{
                curr[1] = Math.max(curr[1], intervals[i][1]);
            }
        }

        return ans.toArray(new int[0][]);
    }

}
