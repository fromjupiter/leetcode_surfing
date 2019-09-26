package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class InsertIntervals_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0) return new int[][]{newInterval};

        int insPos=-1;
        if(intervals[0][0]<newInterval[0]){
            int start=0, end=intervals.length-1;
            while (start<end){
                if(end-start==1){
                    insPos = intervals[end][0]>newInterval[0]?start:end;
                    break;
                }
                int mid = (end+start)/2;
                if(intervals[mid][0]==newInterval[0]) {
                    insPos = mid;
                    break;
                } else if(intervals[mid][0]<newInterval[0]) start = mid;
                else end = mid;
            }
        }

        List<int[]> ans = new ArrayList<>();
        if(insPos==-1){
            ans.add(newInterval);
        } else {
            for (int i = 0; i <= insPos; ++i) ans.add(intervals[i]);
            int[] curr = ans.get(ans.size() - 1);
            if (curr[1] < newInterval[0]) {
                ans.add(newInterval);
            } else {
                curr[1] = Math.max(curr[1], newInterval[1]);
            }
        }
        for(int i=insPos+1;i<intervals.length;++i){
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
