package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void dfs(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(path));
        }

        for(int i=start;i<candidates.length;++i){
            if(candidates[i]>target) continue;
            if(candidates[i]<=target) {
                path.add(candidates[i]);
                dfs(candidates, target-candidates[i], i, path, ans);
                path.remove(path.size()-1);
            }
        }
    }
}
