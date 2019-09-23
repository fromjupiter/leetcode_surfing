package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class Permutation_46 {
    /**
     * basic dfs
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, new boolean[nums.length], new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> ans) {
        if(path.size()==nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;++i){
            if(!visited[i]){
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, visited, path, ans);
                visited[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}
