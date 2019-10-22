package threehd;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Kexiang on 2019/10/21.
 */
public class CourseScheduleTwo_202 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] res = new int[numCourses];
        int[] degree = new int[numCourses];
        boolean[] used = new boolean[numCourses];
        int cur = 0;

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;++i) graph.add(new ArrayList<>());
        for(int[] pre: prerequisites){
            graph.get(pre[1]).add(pre[0]);
            degree[pre[0]]++;
        }

        while (cur<res.length){
            int i;
            boolean circleFlag=true;
            for(i=0;i<numCourses;++i)
                if(degree[i]==0 && !used[i]) {
                    circleFlag = false;
                    used[i]=true;
                    res[cur++] =i;
                    for(int dest:graph.get(i)){
                        degree[dest]--;
                    }
                    break;
                }
            if(circleFlag) return new int[]{};
        }
        return res;
    }
}
