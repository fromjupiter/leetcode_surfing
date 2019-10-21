package threehd;

import java.util.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class CourseSchedule_201 {
    boolean res;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses<2) return true;
        res = true;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;++i) graph.add(new ArrayList<>());
        for(int[] pre: prerequisites){
            graph.get(pre[0]).add(pre[1]);
        }
        boolean[] visited = new boolean[numCourses];
        for(int i=0;i<numCourses;++i){
            if(!visited[i] && !dfs(graph, i, visited)) return false;
        }
        return res;
    }

    public boolean dfs(List<List<Integer>> graph, int curr, boolean[] visited) {
        visited[curr]=true;
        for(int next:graph.get(curr)) {
            if(visited[next]) {
                return false;
            }
            if(!dfs(graph, next, visited)) return false;
        }
        visited[curr]=false;
        return true;
    }
}
